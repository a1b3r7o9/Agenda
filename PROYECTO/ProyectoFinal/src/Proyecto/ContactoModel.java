package Proyecto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContactoModel {

	private BaseDatos bd;

	public ContactoModel() throws SQLException {
		super();
		bd = new BaseDatos();
	}

	public Contacto getById(int id) throws SQLException {
		String sql = "SELECT * FROM contacto WHERE ID=?";
		Object[] params = new Object[1];
		params[0] = id;
		ResultSet result = bd.query(sql, params);

		Contacto contacto = null;
		if (result.next()) {
			contacto = new Contacto(result.getInt("ID"), result.getInt("IDUsuario"), result.getString("Nombre"),
					result.getString("Apellido"), result.getString("Telefono"), result.getString("CorreoElectronico"));
		}
		return contacto;
	}

	public int create(Contacto contacto) throws SQLException {
		String sql = "INSERT INTO contacto (IDUsuario, Nombre, Apellido, Telefono, CorreoElectronico) VALUES(?,?,?,?,?)";
		Object[] params = new Object[5];
		params[0] = contacto.getIdUsuario();
		params[1] = contacto.getNombre();
		params[2] = contacto.getApellidos();
		params[3] = contacto.getTelefono();
		params[4] = contacto.getCorreo();
		int n = bd.execute(sql, params);
		return n;
	}

	public List<Contacto> getAll() throws SQLException {
		String sql = "SELECT * FROM contacto";
		Object[] params = new Object[0];
		ResultSet cont = bd.query(sql, params);
		Contacto contact = null;
		List<Contacto> contacto = new ArrayList<>();
		while (cont.next()) {
			contact = new Contacto(cont.getInt("ID"), cont.getInt("IDUsuario"), cont.getString("Nombre"),
					cont.getString("Apellido"), cont.getString("Telefono"), cont.getString("CorreoElectronico"));
			contacto.add(contact);
		}
		return contacto;
	}

	public int updateById(Contacto cliente) throws SQLException {
		String sql = "UPDATE contacto SET IDUsuario=?, Nombre=?, Apellido=?, Telefono=?, CorreoElectronico=? WHERE ID=?";
		Object[] params = new Object[6];
		params[0] = cliente.getIdUsuario();
		params[1] = cliente.getNombre();
		params[2] = cliente.getApellidos();
		params[3] = cliente.getTelefono();
		params[4] = cliente.getCorreo();
		params[5] = cliente.getId();
		int n = bd.execute(sql, params);
		return n;
	}

	public int deleteById(int id) throws SQLException {
		String sql = "DELETE FROM contacto WHERE ID=?";
		Object[] params = new Object[1];
		params[0] = id;
		int n = bd.execute(sql, params);
		return n;
	}

}

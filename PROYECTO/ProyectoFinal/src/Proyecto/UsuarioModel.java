package Proyecto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioModel {

	private BaseDatos bd;

	public UsuarioModel() throws SQLException {
		super();
		bd = new BaseDatos();
	}

	public List<Usuario> getAll() throws SQLException {
		String sql = "SELECT * FROM usuario";
		Object[] params = new Object[0];
		ResultSet use = bd.query(sql, params);
		Usuario user = null;
		List<Usuario> usuario = new ArrayList<>();
		while (use.next()) {
			user = new Usuario(use.getInt("ID"), use.getString("NombreDeUsuario"), use.getString("Contrasena"));
			usuario.add(user);
		}
		return usuario;
	}

}
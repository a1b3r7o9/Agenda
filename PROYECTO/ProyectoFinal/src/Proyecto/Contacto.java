package Proyecto;

import java.util.Objects;

public class Contacto {
	private int id;
	private int idUsuario;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String correo;

	public Contacto() {
		this(0, 0, "", "", "", "");
	}

	public Contacto(int id, int idUsuario, String nombre, String apellidos, String telefono, String correo) {
		super();
		this.id = id;
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.correo = correo;
	}

	public Contacto(String nombre, String apellidos, String telefono, String correo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.correo = correo;
	}

	public Contacto(int idUsuario, String nombre, String apellidos, String telefono, String correo) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.correo = correo;
	}

	public Contacto(int int1, String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, idUsuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return id == other.id && idUsuario == other.idUsuario;
	}

	@Override
	public String toString() {
		return "Contacto [id=" + id + ", idUsuario=" + idUsuario + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", telefono=" + telefono + ", correo=" + correo + "]";
	}

}

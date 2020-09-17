package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;
	
	@Column(name="nombre", nullable=false, length=30)
	private String nombreUsuario;
	
	@Column(name="apellido", nullable = false, length=30)
	private String apellidoUsuario;
	
	@Column(name="tipo", nullable = false, length=30)
	private String tipoUsuario;
	
	@Column(name="correo", nullable = false, length=30)
	private String correoUsuario;
	
	@Column(name="DNI", nullable = false, length=8)
	private String dniUsuario;
	
	@Column(name="celular", nullable = false, length=9)
	private int celularUsuario;
	
	@Column(name="contraseña", nullable = false,  length=30)
	private String contraseñaUsuario;
	
	@Column(name="ciudad", nullable = false, length=30)
	private String ciudadUsuario;

	
	
	public Usuario() {
		super();
	}

	public Usuario(int idUsuario, String nombreUsuario, String apellidoUsuario, String tipoUsuario,
			String correoUsuario, String dniUsuario, int celularUsuario, String contraseñaUsuario,
			String ciudadUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
		this.tipoUsuario = tipoUsuario;
		this.correoUsuario = correoUsuario;
		this.dniUsuario = dniUsuario;
		this.celularUsuario = celularUsuario;
		this.contraseñaUsuario = contraseñaUsuario;
		this.ciudadUsuario = ciudadUsuario;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidoUsuario() {
		return apellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getCorreoUsuario() {
		return correoUsuario;
	}

	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}

	public String getDniUsuario() {
		return dniUsuario;
	}

	public void setDniUsuario(String dniUsuario) {
		this.dniUsuario = dniUsuario;
	}

	public int getCelularUsuario() {
		return celularUsuario;
	}

	public void setCelularUsuario(int celularUsuario) {
		this.celularUsuario = celularUsuario;
	}

	public String getContraseñaUsuario() {
		return contraseñaUsuario;
	}

	public void setContraseñaUsuario(String contraseñaUsuario) {
		this.contraseñaUsuario = contraseñaUsuario;
	}

	public String getCiudadUsuario() {
		return ciudadUsuario;
	}

	public void setCiudadUsuario(String ciudadUsuario) {
		this.ciudadUsuario = ciudadUsuario;
	}
	
}

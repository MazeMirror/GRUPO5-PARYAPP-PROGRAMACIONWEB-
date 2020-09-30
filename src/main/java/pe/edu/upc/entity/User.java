package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;
	
	@Column(name="nameUser", nullable=false, length=30)
	private String nameUser;
	
	@Column(name="lastnameUser", nullable = false, length=60)
	private String lastnameUser;
	
	@Column(name="typeUser", nullable = false, length=30)
	private String typeUser;
	
	@Column(name="emailUser", nullable = false, length=30)
	private String emailUser;
	
	@Column(name="dniUser", nullable = false, length=8)
	private String dniUser;
	
	@Column(name="phoneUser", nullable = false, length=9)
	private int phoneUser;
	
	@Column(name="paswordUser", nullable = false,  length=80)
	private String paswordUser;
	
	@Column(name="cityUser", nullable = false, length=30)
	private String cityUser;

	
	
	public User() {
		super();
	}



	public User(int idUser, String nameUser, String lastnameUser, String typeUser, String emailUser, String dniUser,
			int phoneUser, String paswordUser, String cityUser) {
		super();
		this.idUser = idUser;
		this.nameUser = nameUser;
		this.lastnameUser = lastnameUser;
		this.typeUser = typeUser;
		this.emailUser = emailUser;
		this.dniUser = dniUser;
		this.phoneUser = phoneUser;
		this.paswordUser = paswordUser;
		this.cityUser = cityUser;
	}



	public int getIdUser() {
		return idUser;
	}



	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}



	public String getNameUser() {
		return nameUser;
	}



	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}



	public String getLastnameUser() {
		return lastnameUser;
	}



	public void setLastnameUser(String lastnameUser) {
		this.lastnameUser = lastnameUser;
	}



	public String getTypeUser() {
		return typeUser;
	}



	public void setTypeUser(String typeUser) {
		this.typeUser = typeUser;
	}



	public String getEmailUser() {
		return emailUser;
	}



	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}



	public String getDniUser() {
		return dniUser;
	}



	public void setDniUser(String dniUser) {
		this.dniUser = dniUser;
	}



	public int getPhoneUser() {
		return phoneUser;
	}



	public void setPhoneUser(int phoneUser) {
		this.phoneUser = phoneUser;
	}



	public String getPaswordUser() {
		return paswordUser;
	}



	public void setPaswordUser(String paswordUser) {
		this.paswordUser = paswordUser;
	}



	public String getCityUser() {
		return cityUser;
	}



	public void setCityUser(String cityUser) {
		this.cityUser = cityUser;
	}

	
	
}

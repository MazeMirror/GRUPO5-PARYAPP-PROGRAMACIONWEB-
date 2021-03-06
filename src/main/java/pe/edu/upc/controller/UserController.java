package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Event;
import pe.edu.upc.entity.User;
import pe.edu.upc.service.IUserService;

@Named
@RequestScoped
public class UserController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IUserService uService;
	private User User;
	List<User> listaUser;
	
	@PostConstruct
	public void init() {
		this.listaUser = new ArrayList<User>();
		this.User = new User();
		this.listar();
	}
	
	public void insertar() {
		try {
			uService.insertar(User);
			limpiarUser();
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
		
	public void listar() {
		try {
			listaUser = uService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarUser() {
		this.init();
	}
	
	public void eliminar(User us) {
		try {
			uService.eliminar(us.getIdUser());
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}			
	}
	
	public void findbyName() {
		try {
			if (User.getNameUser().isEmpty()) {
				this.listar();
			} else {
				listaUser = this.uService.finByName(this.getUser());
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public String goUpdate(User user) {
		this.setUser(user);;
		return "user.xhtml";
		
	}
	
	public void update() {
		try {
			uService.update(User);
			this.listar();	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public User getUser() {
		return User;
	}

	public void setUser(User User) {
		this.User = User;
	}

	public List<User> getListaUser() {
		return listaUser;
	}

	public void setListaUser(List<User> listaUser) {
		this.listaUser = listaUser;
	}	

}

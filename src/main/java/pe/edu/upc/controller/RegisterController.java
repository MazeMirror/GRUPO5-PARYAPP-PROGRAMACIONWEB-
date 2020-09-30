package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.mindrot.jbcrypt.BCrypt; 

import pe.edu.upc.entity.Rol;
import pe.edu.upc.entity.User;
import pe.edu.upc.service.IRolService;
import pe.edu.upc.service.IUserService;

@Named
@ViewScoped
public class RegisterController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IRolService rS;
	@Inject
	private IUserService uS;

	private User user;

	@PostConstruct
	public void init() {
		this.user = new User();
	}

	public String registerUser() {
		String redirect = null;
		try {
			String password = this.user.getPaswordUser();
			String passwordHash = BCrypt.hashpw(password, BCrypt.gensalt());
			this.user.setPaswordUser(passwordHash);
			this.uS.insertar(user);

			List<Rol> roles = new ArrayList<Rol>();
			int TIPO_USUARIO = 1;
			Rol r = new Rol();
			r.setId(TIPO_USUARIO);
			roles.add(r);
			rS.assignRolesToUser(user, roles);
			redirect = "index?faces-redirect=true";
		} catch (Exception e) {

		}

		return redirect;
	}

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}

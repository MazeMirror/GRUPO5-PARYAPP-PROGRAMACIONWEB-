package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.mindrot.jbcrypt.BCrypt;

import pe.edu.upc.dao.IUserDao;
import pe.edu.upc.entity.User;
import pe.edu.upc.service.IUserService;

@Named
@RequestScoped

public class UserServiceImpl implements IUserService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IUserDao uD;

	@Override
	public void insertar(User User) {
		uD.insertar(User);		
	}

	@Override
	public List<User> listar() {
		return uD.listar();
	}

	@Override
	public void eliminar(int idUser) {
		uD.eliminar(idUser);		
	}
	
	@Override
	public Optional<User> getOne(User t) throws Exception {
		return uD.findById(t);
	}

	@Override
	public Optional<User> authentication(User user) throws Exception {
		String password = user.getPaswordUser();

		String passwordHash = uD.getPassworHashedByUserName(user.getNameUser());

		if (BCrypt.checkpw(password, passwordHash)) {
			user.setPaswordUser(passwordHash);
			return uD.findUserByUsername(user);
		}

		return Optional.of(new User());
	}

}

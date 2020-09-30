package pe.edu.upc.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.entity.User;

public interface IUserService {
	public void insertar(User User);
	public List<User> listar();
	public void eliminar(int idUser);
	
	Optional<User> getOne(User user) throws Exception;

	Optional<User> authentication(User us) throws Exception;
	
}

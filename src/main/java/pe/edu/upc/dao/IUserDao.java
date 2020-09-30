package pe.edu.upc.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.entity.User;

public interface IUserDao {
	public void insertar(User User);
	public List<User> listar();
	public void eliminar(int idUser);
	
	Optional<User> findById(User user) throws Exception;

	String getPassworHashedByUserName(String username) throws Exception;

	Optional<User> findUserByUsername(User user) throws Exception;
	
}

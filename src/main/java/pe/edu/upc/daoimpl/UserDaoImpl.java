package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IUserDao;
import pe.edu.upc.entity.User;

public class UserDaoImpl implements IUserDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "pary")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(User User) {
		try {
			em.persist(User);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> listar() {
		List<User> lista = new ArrayList<User>();
		try {
			Query q = em.createQuery("select u from User u");
			lista = (List<User>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idUser) {
		User user = new User();
		try {
			user = em.getReference(User.class,idUser);
			em.remove(user);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}				
	}
	
	@Override
	public Optional<User> findById(User t) throws Exception {

		User user;
		TypedQuery<User> query = em.createQuery("SELECT u FROM User u WHERE u.idUser = ?1", User.class);
		query.setParameter(1, t.getIdUser());

		user = query.getSingleResult();

		return Optional.of(user);
	}

	@Override
	public String getPassworHashedByUserName(String username) throws Exception {
		User user = new User();

		try {

			Query query = em.createQuery("FROM User u WHERE u.nameUser = ?1");
			query.setParameter(1, username);
			@SuppressWarnings("unchecked")
			List<User> lista = query.getResultList();
			if (!lista.isEmpty()) {
				user = lista.get(0);
			}
		} catch (Exception e) {
			throw e;
		}

		return user != null ? user.getPaswordUser() : "";
	}

	@Override
	public Optional<User> findUserByUsername(User user) throws Exception {
		
		User userFound;
		TypedQuery<User> query = em.createQuery("FROM User u WHERE u.nameUser = ?1 and u.paswordUser = ?2", User.class);
		query.setParameter(1, user.getNameUser());
		query.setParameter(2, user.getPaswordUser());
		userFound = query.getSingleResult();

		return Optional.of(userFound);
	}


}

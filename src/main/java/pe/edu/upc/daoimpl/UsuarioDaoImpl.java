package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IUsuarioDao;
import pe.edu.upc.entity.Usuario;

public class UsuarioDaoImpl implements IUsuarioDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "pary")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Usuario usuario) {
		try {
			em.persist(usuario);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> listar() {
		List<Usuario> lista = new ArrayList<Usuario>();
		try {
			Query q = em.createQuery("select u from Usuario u");
			lista = (List<Usuario>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idUsuario) {
		Usuario user = new Usuario();
		try {
			user = em.getReference(Usuario.class,idUsuario);
			em.remove(user);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}				
	}

}

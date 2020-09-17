package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IEventoDao;
import pe.edu.upc.entity.Evento;

public class EventoDaoImpl implements IEventoDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "pary")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Evento evento) {
		try {
			em.persist(evento);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Evento> listar() {
		List<Evento> lista = new ArrayList<Evento>();
		try {
			Query q = em.createQuery("select e from Evento e");
			lista = (List<Evento>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idEvento) {
		Evento eve = new Evento();
		try {
			eve = em.getReference(Evento.class,idEvento);
			em.remove(eve);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}				
	}
	
	
}

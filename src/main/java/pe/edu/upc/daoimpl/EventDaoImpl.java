package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IEventDao;
import pe.edu.upc.entity.Event;

public class EventDaoImpl implements IEventDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "pary")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Event Event) {
		try {
			em.persist(Event);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Event> listar() {
		List<Event> lista = new ArrayList<Event>();
		try {
			Query q = em.createQuery("select e from Event e");
			lista = (List<Event>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idEvent) {
		Event eve = new Event();
		try {
			eve = em.getReference(Event.class,idEvent);
			em.remove(eve);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}				
	}
	
	
}

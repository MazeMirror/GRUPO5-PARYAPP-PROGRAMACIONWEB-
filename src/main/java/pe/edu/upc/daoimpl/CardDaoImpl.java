package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ICardDao;
import pe.edu.upc.entity.Card;

public class CardDaoImpl  implements ICardDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "pary")
	private EntityManager em;
	
	
	@Transactional
	@Override
	public void insertar(Card card) {
		// TODO Auto-generated method stub
		try {
			em.persist(card);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Card> listar() {
		List<Card> lista = new ArrayList<Card>();
		try {
			Query q = em.createQuery("select m from Card m");
			lista = (List<Card>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}

	
	@Transactional
	@Override
	public void eliminar(int idCard) {
		Card mot = new Card();
		try {
			mot = em.getReference(Card.class,idCard);
			em.remove(mot);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}			
		
	}
	
	@Transactional
	@Override
	public void update(Card card) {
		try {
			em.merge(card);
		} catch (Exception e) {
			System.out.println("Error al actualizar Tarjeta");
		}
		
	}

}

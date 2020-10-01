package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ICompraDao;
import pe.edu.upc.entity.Compra;

public class CompraDaoImpl implements ICompraDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "pary")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Compra Compra) {
		try {
			em.persist(Compra);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Compra> listar() {
		List<Compra> lista = new ArrayList<Compra>();
		try {
			Query q = em.createQuery("select e from Compra e");
			lista = (List<Compra>) q.getResultList();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return lista;
	}
	
}

package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ICardDao;
import pe.edu.upc.entity.Card;
import pe.edu.upc.service.ICardService;

@Named
@RequestScoped
public class CardServiceImpl implements ICardService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private ICardDao mD;
	
	@Override
	public void insertar(Card card) {
		// TODO Auto-generated method stub
		mD.insertar(card);		
	}

	@Override
	public List<Card> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idCard) {
		// TODO Auto-generated method stub
		mD.eliminar(idCard);
	}
	
	

}

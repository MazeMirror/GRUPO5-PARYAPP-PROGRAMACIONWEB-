package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Card;
import pe.edu.upc.service.ICardService;

@Named
@RequestScoped
public class CardController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ICardService mService;
	private Card card;
	List<Card> listaCards;
	
	@PostConstruct
	public void init() {
		this.listaCards = new ArrayList<Card>();
		this.card = new Card();
		this.listar();
	}
	
	public String nuevoCards() {
		this.setCard(new Card());
		return "card.xhtml";
	}
	
	public void insertar() {
		try {
			mService.insertar(card);
			limpiarCard();
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
		
	public void listar() {
		try {
			listaCards = mService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarCard() {
		this.init();
	}
	
	public void eliminar(Card mo) {
		try {
			mService.eliminar(mo.getIdCard());
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}			
	}
	

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public List<Card> getListaCards() {
		return listaCards;
	}

	public void setListaMotores(List<Card> listaCards) {
		this.listaCards = listaCards;
	}
	

	public String goUpdate(Card card) {
		this.setCard(card);
		return "updateCard2.xhtml";
		
	}
	
	public void update() {
		try {
			mService.update(card);
			this.listar();	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

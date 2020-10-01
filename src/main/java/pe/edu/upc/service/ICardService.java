package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Card;

public interface ICardService {
	public void insertar(Card card);
	public List<Card> listar();
	public void eliminar(int idCard);
	public void update(Card card);
	
	
}

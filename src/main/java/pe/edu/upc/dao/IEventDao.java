package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Event;

public interface IEventDao {
	public void insertar(Event Event);
	public List<Event> listar();
	public void eliminar(int idEvent);
}

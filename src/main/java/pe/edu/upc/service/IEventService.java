package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Event;

public interface IEventService {
	public void insertar(Event Event);
	public List<Event> listar();
	public void eliminar(int idEvent);
    public List<Event> findByNameVaccine(Event event);
	public void update(Event event);
}


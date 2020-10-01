package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IEventDao;
import pe.edu.upc.entity.Event;
import pe.edu.upc.service.IEventService;

@Named
@RequestScoped

public class EventServiceImpl implements IEventService, Serializable{

private static final long serialVersionUID = 1L;
	
	@Inject
	private IEventDao eD;

	@Override
	public void insertar(Event Event) {
		eD.insertar(Event);		
	}

	@Override
	public List<Event> listar() {
		return eD.listar();
	}

	@Override
	public void eliminar(int idEvent) {
		eD.eliminar(idEvent);		
	}

	@Override
	public List<Event> findByNameVaccine(Event event) {
	
		return eD.findByNameEvent(event);
	}

	@Override
	public void update(Event event) {
		eD.update(event);
	}

}

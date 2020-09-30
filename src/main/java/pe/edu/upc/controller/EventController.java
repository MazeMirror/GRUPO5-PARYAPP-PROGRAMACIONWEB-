package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Event;
import pe.edu.upc.service.IEventService;

@Named
@RequestScoped
public class EventController implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Inject
	private IEventService eService;
	private Event Event;
	List<Event> listaEvent;
	
	@PostConstruct
	public void init() {
		this.listaEvent = new ArrayList<Event>();
		this.Event = new Event();
		this.listar();
	}
	
	public String nuevoEvent() {
		this.setEvent(new Event());
		return "event.xhtml";
	}
	
	public void insertar() {
		try {
			eService.insertar(Event);
			limpiarEvent();
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
		
	public void listar() {
		try {
			listaEvent = eService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarEvent() {
		this.init();
	}
	
	public void eliminar(Event ev) {
		try {
			eService.eliminar(ev.getIdEvent());
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}			
	}
	

	public Event getEvent() {
		return Event;
	}

	public void setEvent(Event Event) {
		this.Event = Event;
	}

	public List<Event> getListaEvent() {
		return listaEvent;
	}

	public void setListaEvent(List<Event> listaEvent) {
		this.listaEvent = listaEvent;
	}
	
}

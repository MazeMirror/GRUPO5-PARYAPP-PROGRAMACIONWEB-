package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Compra;
import pe.edu.upc.entity.Event;
import pe.edu.upc.service.ICompraService;
import pe.edu.upc.service.IEventService;

@Named
@RequestScoped
public class CompraController{

	@Inject
	private ICompraService eCompra;

	@Inject
	private IEventService eEvent;

	
	
	private Compra compra;
	private Event event;
	List<Compra> listaCompras;
	List<Event> listaEvents;
	
	@PostConstruct
	public void init() {
		this.compra = new Compra();
		this.event = new Event();
		this.listaCompras = new ArrayList<Compra>();
		this.listaEvents = new ArrayList<Event>();
		this.listar();
		this.listEventos();
	}
	
	public String nuevoCompra() {
		this.setCompra(new Compra());
		listaEvents = eEvent.listar();
		return "compra.xhtml";
	}
	
	public void insertar() {
		try {
			eCompra.insertar(compra);
			this.limpiarCompra();
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println("Aqui el error");
		}
	}
		
	public void listar() {
		try {
			listaCompras = eCompra.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarCompra() {
		this.init();
	}

	public void listEventos() {
	
		try {
			listaEvents = eEvent.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public List<Compra> getListaCompras() {
		return listaCompras;
	}

	public void setListaCompras(List<Compra> listaCompras) {
		this.listaCompras = listaCompras;
	}

	public List<Event> getListaEvents() {
		return listaEvents;
	}

	public void setListaEvents(List<Event> listaEvents) {
		this.listaEvents = listaEvents;
	}
	
	
}

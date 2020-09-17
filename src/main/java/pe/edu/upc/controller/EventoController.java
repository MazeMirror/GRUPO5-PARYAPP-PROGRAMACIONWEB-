package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Evento;
import pe.edu.upc.service.IEventoService;

@Named
@RequestScoped
public class EventoController implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Inject
	private IEventoService eService;
	private Evento evento;
	List<Evento> listaEvento;
	
	@PostConstruct
	public void init() {
		this.listaEvento = new ArrayList<Evento>();
		this.evento = new Evento();
		this.listar();
	}
	
	public String nuevoEvento() {
		this.setEvento(new Evento());
		return "evento.xhtml";
	}
	
	public void insertar() {
		try {
			eService.insertar(evento);
			limpiarEvento();
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
		
	public void listar() {
		try {
			listaEvento = eService.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}
	
	public void limpiarEvento() {
		this.init();
	}
	
	public void eliminar(Evento ev) {
		try {
			eService.eliminar(ev.getIdEvento());
			this.listar();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}			
	}
	

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public List<Evento> getListaEvento() {
		return listaEvento;
	}

	public void setListaEvento(List<Evento> listaEvento) {
		this.listaEvento = listaEvento;
	}
	
}

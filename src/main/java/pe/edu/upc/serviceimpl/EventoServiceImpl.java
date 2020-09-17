package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IEventoDao;
import pe.edu.upc.entity.Evento;
import pe.edu.upc.service.IEventoService;

@Named
@RequestScoped

public class EventoServiceImpl implements IEventoService, Serializable{

private static final long serialVersionUID = 1L;
	
	@Inject
	private IEventoDao eD;

	@Override
	public void insertar(Evento evento) {
		eD.insertar(evento);		
	}

	@Override
	public List<Evento> listar() {
		return eD.listar();
	}

	@Override
	public void eliminar(int idEvento) {
		eD.eliminar(idEvento);		
	}

	
	
}

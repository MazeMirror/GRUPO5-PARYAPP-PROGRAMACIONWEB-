package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ICompraDao;
import pe.edu.upc.entity.Compra;
import pe.edu.upc.service.ICompraService;

@Named
@RequestScoped

public class CompraServiceImpl implements ICompraService, Serializable{

private static final long serialVersionUID = 1L;
	
	@Inject
	private ICompraDao eD;

	@Override
	public void insertar(Compra Compra) {
		eD.insertar(Compra);		
	}

	@Override
	public List<Compra> listar() {
		return eD.listar();
	}


}

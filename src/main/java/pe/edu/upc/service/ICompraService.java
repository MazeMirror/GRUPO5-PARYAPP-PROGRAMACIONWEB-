package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Compra;

public interface ICompraService {
	public void insertar(Compra Compra);
	public List<Compra> listar();
}

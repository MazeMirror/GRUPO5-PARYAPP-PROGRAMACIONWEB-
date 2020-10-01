package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Compra;


public interface ICompraDao {
	public void insertar(Compra Compra);
	public List<Compra> listar();
}

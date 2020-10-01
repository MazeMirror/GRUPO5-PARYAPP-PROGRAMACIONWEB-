package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "compra")
public class Compra implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCompra;
	
	private Date dateCompra;
	
	@Column(name="numberEntrada", nullable = false, length=1000)
	private int numberEntrada;
	
	@Column(name="TipoComprobante", nullable = false, length=30)
	private String TipoComprobante;
	
	@Column(name="MontoFinal", nullable = false, length=1000)
	private int MontoFinal;
	
	@ManyToOne
	@JoinColumn(name = "idEvent", nullable = false)
	private Event event;
	
	public Compra() {
		super();
	}

	public Compra(int idCompra, Date dateCompra, int numberEntrada, String tipoComprobante, int montoFinal, User usuario,
			Event event) {
		super();
		this.idCompra = idCompra;
		this.dateCompra = dateCompra;
		this.numberEntrada = numberEntrada;
		TipoComprobante = tipoComprobante;
		MontoFinal = montoFinal;
		this.event = event;
	}



	public int getIdCompra() {
		return idCompra;
	}



	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}



	public Date getDateCompra() {
		return dateCompra;
	}



	public void setDateCompra(Date dateCompra) {
		this.dateCompra = dateCompra;
	}



	public int getNumberEntrada() {
		return numberEntrada;
	}



	public void setNumberEntrada(int numberEntrada) {
		this.numberEntrada = numberEntrada;
	}



	public String getTipoComprobante() {
		return TipoComprobante;
	}



	public void setTipoComprobante(String tipoComprobante) {
		TipoComprobante = tipoComprobante;
	}



	public int getMontoFinal() {
		return MontoFinal;
	}



	public void setMontoFinal(int montoFinal) {
		MontoFinal = montoFinal;
	}



	public Event getEvent() {
		return event;
	}



	public void setEvent(Event event) {
		this.event = event;
	}



	

}

	
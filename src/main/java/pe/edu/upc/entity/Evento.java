package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "evento")
public class Evento implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEvento;
	
	@Column(name="nombre", nullable = false, length=70)
	private String nombreEvento;

	private Date fechaEvento;
	
	@Column(name="entradas", nullable = false, length=5)
	private int cantidadEntradas;
	
	@Column(name="precio", nullable = false, length=3)
	private int precioEntrada;
	
	@Column(name = "inicio", nullable = false, length = 20)
	private Date horaInicio;
	
	@Column(name = "fin", nullable = false, length = 20)
	private Date horaFin;
	
	@Column(name = "descripcion", nullable = false, length = 500)
	private String descipcionEvento;

	
	
	public Evento() {
		super();
	}



	public Evento(int idEvento, String nombreEvento, Date fechaEvento, int cantidadEntradas, int precioEntrada,
			Date horaInicio, Date horaFin) {
		super();
		this.idEvento = idEvento;
		this.nombreEvento = nombreEvento;
		this.fechaEvento = fechaEvento;
		this.cantidadEntradas = cantidadEntradas;
		this.precioEntrada = precioEntrada;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}



	public int getIdEvento() {
		return idEvento;
	}



	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}



	public String getNombreEvento() {
		return nombreEvento;
	}



	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}



	public Date getFechaEvento() {
		return fechaEvento;
	}



	public void setFechaEvento(Date fechaEvento) {
		this.fechaEvento = fechaEvento;
	}



	public int getCantidadEntradas() {
		return cantidadEntradas;
	}



	public void setCantidadEntradas(int cantidadEntradas) {
		this.cantidadEntradas = cantidadEntradas;
	}



	public int getPrecioEntrada() {
		return precioEntrada;
	}



	public void setPrecioEntrada(int precioEntrada) {
		this.precioEntrada = precioEntrada;
	}



	public Date getHoraInicio() {
		return horaInicio;
	}



	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}



	public Date getHoraFin() {
		return horaFin;
	}



	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}



	public String getDescipcionEvento() {
		return descipcionEvento;
	}



	public void setDescipcionEvento(String descipcionEvento) {
		this.descipcionEvento = descipcionEvento;
	}


	
}

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
@Table(name = "event")
public class Event implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEvent;
	
	@Column(name="nameEvent", nullable = false, length=70)
	private String nameEvent;

	private Date dateEvent;
	
	@Column(name="numberTickets", nullable = false, length=5)
	private int numberTickets;
	
	@Column(name="priceTicket", nullable = false, length=3)
	private int priceTicket;
	
	@Column(name = "startTime", nullable = false, length = 20)
	private Date startTime;
	
	@Column(name = "endsTime", nullable = false, length = 20)
	private Date endsTime;
	
	@Column(name = "descripcionEvent", nullable = false, length = 500)
	private String descripcionEvent;

	
	
	public Event() {
		super();
	}



	public Event(int idEvent, String nameEvent, Date dateEvent, int numberTickets, int priceTicket, Date startTime,
			Date endsTime, String descripcionEvent) {
		super();
		this.idEvent = idEvent;
		this.nameEvent = nameEvent;
		this.dateEvent = dateEvent;
		this.numberTickets = numberTickets;
		this.priceTicket = priceTicket;
		this.startTime = startTime;
		this.endsTime = endsTime;
		this.descripcionEvent = descripcionEvent;
	}



	public int getIdEvent() {
		return idEvent;
	}



	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}



	public String getNameEvent() {
		return nameEvent;
	}



	public void setNameEvent(String nameEvent) {
		this.nameEvent = nameEvent;
	}



	public Date getDateEvent() {
		return dateEvent;
	}



	public void setDateEvent(Date dateEvent) {
		this.dateEvent = dateEvent;
	}



	public int getNumberTickets() {
		return numberTickets;
	}



	public void setNumberTickets(int numberTickets) {
		this.numberTickets = numberTickets;
	}



	public int getPriceTicket() {
		return priceTicket;
	}



	public void setPriceTicket(int priceTicket) {
		this.priceTicket = priceTicket;
	}



	public Date getStartTime() {
		return startTime;
	}



	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}



	public Date getEndsTime() {
		return endsTime;
	}



	public void setEndsTime(Date endsTime) {
		this.endsTime = endsTime;
	}



	public String getDescripcionEvent() {
		return descripcionEvent;
	}



	public void setDescripcionEvent(String descripcionEvent) {
		this.descripcionEvent = descripcionEvent;
	}


	
}

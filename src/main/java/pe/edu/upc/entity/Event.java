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
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateEvent == null) ? 0 : dateEvent.hashCode());
		result = prime * result + ((descripcionEvent == null) ? 0 : descripcionEvent.hashCode());
		result = prime * result + ((endsTime == null) ? 0 : endsTime.hashCode());
		result = prime * result + idEvent;
		result = prime * result + ((nameEvent == null) ? 0 : nameEvent.hashCode());
		result = prime * result + numberTickets;
		result = prime * result + priceTicket;
		result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (dateEvent == null) {
			if (other.dateEvent != null)
				return false;
		} else if (!dateEvent.equals(other.dateEvent))
			return false;
		if (descripcionEvent == null) {
			if (other.descripcionEvent != null)
				return false;
		} else if (!descripcionEvent.equals(other.descripcionEvent))
			return false;
		if (endsTime == null) {
			if (other.endsTime != null)
				return false;
		} else if (!endsTime.equals(other.endsTime))
			return false;
		if (idEvent != other.idEvent)
			return false;
		if (nameEvent == null) {
			if (other.nameEvent != null)
				return false;
		} else if (!nameEvent.equals(other.nameEvent))
			return false;
		if (numberTickets != other.numberTickets)
			return false;
		if (priceTicket != other.priceTicket)
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
			return false;
		return true;
	}



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

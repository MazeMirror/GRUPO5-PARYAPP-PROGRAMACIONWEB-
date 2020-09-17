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
@Table(name="card")
public class Card implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCard;
	
	@Column(name="nameonCard", nullable=false, length=30)
	private String nameonCard;
	
	private Date expirationDate;
	
	@Column(name="numberCard", nullable=false, length=12)
	private String numberCard;
	
	private int cvv;

	public Card(int idCard, String nameonCard, Date expirationDate, String numberCard, int cvv) {
		super();
		this.idCard = idCard;
		this.nameonCard = nameonCard;
		this.expirationDate = expirationDate;
		this.numberCard = numberCard;
		this.cvv = cvv;
	}

	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdCard() {
		return idCard;
	}

	public void setIdCard(int idCard) {
		this.idCard = idCard;
	}

	public String getNameonCard() {
		return nameonCard;
	}

	public void setNameonCard(String nameonCard) {
		this.nameonCard = nameonCard;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getNumberCard() {
		return numberCard;
	}

	public void setNumberCard(String numberCard) {
		this.numberCard = numberCard;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	
	
	
}

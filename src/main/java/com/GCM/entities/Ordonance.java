package com.GCM.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="ordonance")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Ordonance {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date date_ord ;
	private String dosage ;
	
public Ordonance() {
		super();
	}



	public Ordonance(Date date_ord, String dosage) {
		super();
		this.date_ord = date_ord;
		this.dosage = dosage;
		
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate_ord() {
		return date_ord;
	}

	public void setDate_ord(Date date_ord) {
		this.date_ord = date_ord;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}




	
	

}

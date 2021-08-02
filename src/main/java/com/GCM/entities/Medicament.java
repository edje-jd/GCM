package com.GCM.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicament")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Medicament {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	private String typeMedc ;
	private String nomMedc ;
	public Medicament() {
		super();
	}
	public Medicament(String typeMedc, String nomMedc) {
		super();
		this.typeMedc = typeMedc;
		this.nomMedc = nomMedc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeMedc() {
		return typeMedc;
	}
	public void setTypeMedc(String typeMedc) {
		this.typeMedc = typeMedc;
	}
	public String getNomMedc() {
		return nomMedc;
	}
	public void setNomMedc(String nomMedc) {
		this.nomMedc = nomMedc;
	}
	

	
}

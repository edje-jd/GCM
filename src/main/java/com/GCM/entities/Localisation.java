package com.GCM.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "localisation")
public class Localisation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	private String nom_moghata ;
	private String nom_commune ;
	public Localisation() {
		super();
	}
	public Localisation(String nom_moghata, String nom_commune) {
		super();
		this.nom_moghata = nom_moghata;
		this.nom_commune = nom_commune;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom_moghata() {
		return nom_moghata;
	}
	public void setNom_moghata(String nom_moghata) {
		this.nom_moghata = nom_moghata;
	}
	public String getNom_commune() {
		return nom_commune;
	}
	public void setNom_commune(String nom_commune) {
		this.nom_commune = nom_commune;
	}
	
	
	

}

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
@Table(name = "antecedent")
public class Antecedent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom_malade;
	
	

	public Antecedent() {
		super();
	}

	public Antecedent(String nom_malade) {
		super();
		this.nom_malade = nom_malade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom_malade() {
		return nom_malade;
	}

	public void setNom_malade(String nom_malade) {
		this.nom_malade = nom_malade;
	}
	

}

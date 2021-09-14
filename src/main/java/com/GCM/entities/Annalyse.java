package com.GCM.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "annalye")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Annalyse {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
	private int id ;
	private Date dateAnls;
	private String nomAnls ;
	private String nom_labo ;
	
	


	public Annalyse() {
		super();
	}

	

	public Annalyse(Date dateAnls, String nomAnls, String nom_labo) {
		super();
		this.dateAnls = dateAnls;
		this.nomAnls = nomAnls;
		this.nom_labo = nom_labo;
	}



	public Date getDateAnls() {
		return dateAnls;
	}



	public void setDateAnls(Date dateAnls) {
		this.dateAnls = dateAnls;
	}



	public String getNom_labo() {
		return nom_labo;
	}

	public void setNom_labo(String nom_labo) {
		this.nom_labo = nom_labo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomAnls() {
		return nomAnls;
	}

	public void setNomAnls(String nomAnls) {
		this.nomAnls = nomAnls;
	}

	

}


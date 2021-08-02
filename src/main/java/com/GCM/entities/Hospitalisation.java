package com.GCM.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Hospitalisation")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Hospitalisation {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
	private int id ;
	private Date date_debut_hosp ;
	private Date date_fin_hosp ;
	private int numLit ;
	private int numChambre;
	private String nomUnite ;
	private String traitement ;

	


	public Hospitalisation() {
		super();
	}

	public Hospitalisation(Date date_debut_hosp, Date date_fin_hosp, int numLit, int numChambre, String nomUnite, String traitement) {
		this.date_debut_hosp = date_debut_hosp;
		this.date_fin_hosp = date_fin_hosp;
		this.numLit = numLit;
		this.numChambre = numChambre;
		this.nomUnite = nomUnite;
		this.traitement = traitement;
	}

	public Date getDate_debut_hosp() {
		return date_debut_hosp;
	}

	public void setDate_debut_hosp(Date date_debut_hosp) {
		this.date_debut_hosp = date_debut_hosp;
	}

	public Date getDate_fin_hosp() {
		return date_fin_hosp;
	}

	public void setDate_fin_hosp(Date date_fin_hosp) {
		this.date_fin_hosp = date_fin_hosp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumChambre() {
		return numChambre;
	}

	public void setNumChambre(int numChambre) {
		this.numChambre = numChambre;
	}

	public String getNomUnite() {
		return nomUnite;
	}

	public void setNomUnite(String nomUnite) {
		this.nomUnite = nomUnite;
	}

	public int getNumLit() {
		return numLit;
	}

	public void setNumLit(int numLit) {
		this.numLit = numLit;
	}

	public String getTraitement() {
		return traitement;
	}

	public void setTraitement(String traitement) {
		this.traitement = traitement;
	}
}

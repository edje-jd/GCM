package com.GCM.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="Plage_horaire")
public class Plage_Horaire {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	private String heure_deb ;
	private String heure_fin ;
	
	

	public Plage_Horaire() {
		super();
	}

	public Plage_Horaire(String heure_deb, String heure_fin) {
		super();
		this.heure_deb = heure_deb;
		this.heure_fin = heure_fin;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHeure_deb() {
		return heure_deb;
	}

	public void setHeure_deb(String heure_deb) {
		this.heure_deb = heure_deb;
	}


	public String getHeure_fin() {
		return heure_fin;
	}

	public void setHeure_fin(String heure_fin) {
		this.heure_fin = heure_fin;
	}

	


}

package com.GCM.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="secretaire")
public class Secretaire {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	private String nom_sec ;
	private String email ;
	private int num_tel ;


	public Secretaire() {
		super();
	}

	public Secretaire(String nom_sec, String email, int num_tel) {
		super();
		this.nom_sec = nom_sec;
		this.email = email;
		this.num_tel = num_tel;
	
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom_sec() {
		return nom_sec;
	}

	public void setNom_sec(String nom_sec) {
		this.nom_sec = nom_sec;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNum_tel() {
		return num_tel;
	}

	public void setNum_tel(int num_tel) {
		this.num_tel = num_tel;
	}
	

}

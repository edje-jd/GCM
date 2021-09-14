package com.GCM.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "Medecin")
public class Medecin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private int id;
    private String name;
    private String specialicite ;
    private int numPhone ;
    private String email;
    
    



	public Medecin(String name, String specialicite, int numPhone, String email) {
		super();
		this.name = name;
		this.specialicite = specialicite;
		this.numPhone = numPhone;
		this.email = email;
	}
	

	public int getNumPhone() {
		return numPhone;
	}


	public void setNumPhone(int numPhone) {
		this.numPhone = numPhone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Medecin() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialicite() {
		return specialicite;
	}

	public void setSpecialicite(String specialicite) {
		this.specialicite = specialicite;
	}

    

}

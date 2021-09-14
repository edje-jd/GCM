package com.GCM.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
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
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "Patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private int id;
    private String name;
    private String phone;
    private int Age;
    private String sexe ;
    private String adresse ;
    private String antecedent;
    
    
    
//   
//    
//    @ManyToMany(fetch = FetchType.LAZY)
//	@JoinTable(	name = "patient_localisation", 
//				joinColumns = @JoinColumn(name = "patient_id"), 
//				inverseJoinColumns = @JoinColumn(name = "localisation_id"))
//    
//    private Collection<Localisation> localisations;
//    
    
   


	public Patient() {
		super();
	}





	





	public Patient(String name, String phone, int age, String sexe, String adresse, String antecedent) {
	super();
	this.name = name;
	this.phone = phone;
	Age = age;
	this.sexe = sexe;
	this.adresse = adresse;
	this.antecedent = antecedent;
}











	public String getAntecedent() {
		return antecedent;
	}











	public void setAntecedent(String antecedent) {
		this.antecedent = antecedent;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	

	public int getAge() {
		return Age;
	}





	public void setAge(int age) {
		Age = age;
	}





	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}




//	public Collection<Localisation> getLocalisations() {
//		return localisations;
//	}
//
//
//
//	public void setLocalisations(Collection<Localisation> localisations) {
//		this.localisations = localisations;
//	}
//	
	
}

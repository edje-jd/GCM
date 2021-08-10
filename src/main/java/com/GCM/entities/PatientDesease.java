package com.GCM.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;



@Entity
@Table(name = "Pa")

public class PatientDesease {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne(fetch = FetchType.LAZY)


	private Antecedent antcedent;

	@ManyToOne(fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)

	private Patient patient;

	@ManyToOne(fetch = FetchType.LAZY)
	private Localisation localisation ;



	public PatientDesease() {
		super();
	}


	public Localisation getLocalisation() {
		return localisation;
	}

	public void setLocalisation(Localisation localisation) {
		this.localisation = localisation;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Antecedent getAntcedent() {
		return antcedent;
	}

	public void setAntcedent(Antecedent antcedent) {
		this.antcedent = antcedent;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}


}
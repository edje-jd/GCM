package com.GCM.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "VisitePM")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class VisitePM {

		
			@Id
			@GeneratedValue(strategy = GenerationType.AUTO)
			private long id;
			
			@ManyToOne(fetch = FetchType.LAZY)
			@Cascade(CascadeType.ALL)
			private Visite visite ;
			
			
			
			@ManyToOne(fetch = FetchType.LAZY)
			private Patient patient;
			
			@ManyToOne(fetch = FetchType.LAZY)
			
			private MedecinPH medecinPH ;
			
			
			public VisitePM() {
				super();
			}



			public VisitePM(Visite visite,  Patient patient, MedecinPH medecinPH) {
				super();
				this.visite = visite;

				this.patient = patient;
				this.medecinPH = medecinPH;

			}



			public long getId() {
				return id;
			}

			public void setId(long id) {
				this.id = id;
			}

			public Visite getVisite() {
				return visite;
			}


	public MedecinPH getMedecinPH() {
		return medecinPH;
	}

	public void setMedecinPH(MedecinPH medecinPH) {
		this.medecinPH = medecinPH;
	}

	public void setVisite(Visite visite) {
				this.visite = visite;
			}

			

			public Patient getPatient() {
				return patient;
			}

			public void setPatient(Patient patient) {
				this.patient = patient;
			}

			

}

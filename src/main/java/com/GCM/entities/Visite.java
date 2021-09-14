package com.GCM.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Visite {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	private Date date_visit ;
	private String objet_visit ;
	private String type_visite ;
	private Date date_der_con ;
	private float prix_cons ;
	private boolean effectue ;




	public Visite() {
			super();
		}

	

	public Visite(Date date_visit, String objet_visit, String type_visite, Date date_der_con, float prix_cons,
			boolean effectue) {
		super();
		this.date_visit = date_visit;
		this.objet_visit = objet_visit;
		this.type_visite = type_visite;
		this.date_der_con = date_der_con;
		this.prix_cons = prix_cons;
		this.effectue = effectue;
	}



	


	public boolean isEffectue() {
		return effectue;
	}



	public void setEffectue(boolean effectue) {
		this.effectue = effectue;
	}



	public String getType_visite() {
		return type_visite;
	}

	public void setType_visite(String type_visite) {
		this.type_visite = type_visite;
	}

	public Date getDate_der_con() {
		return date_der_con;
	}

	public void setDate_der_con(Date date_der_con) {
		this.date_der_con = date_der_con;
	}

	public float getPrix_cons() {
		return prix_cons;
	}

	public void setPrix_cons(float prix_cons) {
		this.prix_cons = prix_cons;
	}

	public Long getDate_visit() {
			return date_visit.getTime();
		}




		public void setDate_visit(Date date_visit) {
			this.date_visit = date_visit;
		}




		public String getObjet_visit() {
			return objet_visit;
		}




		public void setObjet_visit(String objet_visit) {
			this.objet_visit = objet_visit;
		}


		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}

		


		
}

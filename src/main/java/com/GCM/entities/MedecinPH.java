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
@Table(name = "MedecinPH")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class MedecinPH {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@Cascade(CascadeType.ALL)
		private Medecin medecin;
		
		@ManyToOne(fetch = FetchType.LAZY)
		private Plage_Horaire plage_Horaire ;

		public MedecinPH() {
			super();
		}
		


		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public Medecin getMedecin() {
			return medecin;
		}

		public void setMedecin(Medecin medecin) {
			this.medecin = medecin;
		}

		public Plage_Horaire getPlage_Horaire() {
			return plage_Horaire;
		}

		public void setPlage_Horaire(Plage_Horaire plage_Horaire) {
			this.plage_Horaire = plage_Horaire;
		}


	@Override
	public String toString() {
		return "MedecinPH{" +
				"id=" + id +
				", medecin=" + medecin +
				", plage_Horaire=" + plage_Horaire +
				'}';
	}
}

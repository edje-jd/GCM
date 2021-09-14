package com.GCM.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
@Table(name = "OrdonanceMV")
public class OrdonanceMV {
	

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		
		@ManyToOne(fetch = FetchType.LAZY)
		private Medicament medicament ;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@Cascade(CascadeType.ALL)
		private Ordonance ordonance;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@Cascade(CascadeType.MERGE)
		private VisitePM visitepm ;

		public OrdonanceMV() {
			super();
		}


	public OrdonanceMV(long id, Medicament medicament, Ordonance ordonance, VisitePM visitepm) {
		this.id = id;
		this.medicament = medicament;
		this.ordonance = ordonance;
		this.visitepm = visitepm;
	}

	public Medicament getMedicament() {
			return medicament;
		}

		public void setMedicament(Medicament medicament) {
			this.medicament = medicament;
		}

		public Ordonance getOrdonance() {
			return ordonance;
		}

		public void setOrdonance(Ordonance ordonance) {
			this.ordonance = ordonance;
		}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public VisitePM getVisitepm() {
		return visitepm;
	}

	public void setVisitepm(VisitePM visitepm) {
		this.visitepm = visitepm;
	}
}

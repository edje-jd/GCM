package com.GCM.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
@Entity
@Table(name = "hospitalisationV")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class HospitalisationV {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @ManyToOne(fetch = FetchType.LAZY)
        @Cascade(org.hibernate.annotations.CascadeType.ALL)
        private Hospitalisation hospitalisation ;

        @ManyToOne(fetch = FetchType.LAZY)
        @Cascade(org.hibernate.annotations.CascadeType.ALL)
        private VisitePM visitePM ;

    public HospitalisationV() {
    }

    public HospitalisationV(Hospitalisation hospitalisation, VisitePM visitePM) {
        this.hospitalisation = hospitalisation;
        this.visitePM = visitePM;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Hospitalisation getHospitalisation() {
        return hospitalisation;
    }

    public void setHospitalisation(Hospitalisation hospitalisation) {
        this.hospitalisation = hospitalisation;
    }

    public VisitePM getVisitePM() {
        return visitePM;
    }

    public void setVisitePM(VisitePM visitePM) {
        this.visitePM = visitePM;
    }
}

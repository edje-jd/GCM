package com.GCM.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
@Entity
@Table(name = "annalyseV")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AnnalyseV {



        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @ManyToOne(fetch = FetchType.LAZY)
        @Cascade(org.hibernate.annotations.CascadeType.ALL)
        private Annalyse annalyse ;


        @ManyToOne(fetch = FetchType.LAZY)
        @Cascade(org.hibernate.annotations.CascadeType.ALL)
        private VisitePM visitePM ;

    public AnnalyseV() {
    }

    public AnnalyseV(Annalyse annalyse, VisitePM visitePM) {
        this.annalyse = annalyse;
        this.visitePM = visitePM;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Annalyse getAnnalyse() {
        return annalyse;
    }

    public void setAnnalyse(Annalyse annalyse) {
        this.annalyse = annalyse;
    }

    public VisitePM getVisitePM() {
        return visitePM;
    }

    public void setVisitePM(VisitePM visitePM) {
        this.visitePM = visitePM;
    }
}

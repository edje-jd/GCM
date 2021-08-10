package com.GCM.dao;

import com.GCM.entities.PatientDesease;
import org.springframework.data.jpa.repository.JpaRepository;

import com.GCM.entities.MedecinPH;

import java.util.Optional;

public interface MedecinPHRepository extends JpaRepository<MedecinPH, Long>{
    void deleteMedecinPHById(Long id);



    Optional<MedecinPH > findMedecinPHById(Long id);
}

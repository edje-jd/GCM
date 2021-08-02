package com.GCM.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GCM.entities.Medecin;

public interface MedecinRepository extends JpaRepository<Medecin, Integer>{
	
	void deleteMedecinById(int id);

    Optional<Medecin> findMedecinById(int id);

}

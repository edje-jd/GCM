package com.GCM.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GCM.entities.Localisation;

public interface LocalisationRepository extends JpaRepository<Localisation, Integer> {
	void deleteLocalisationById(int id);
	
	Optional<Localisation> findLocalisationById(int id);

}

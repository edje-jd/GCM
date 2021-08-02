package com.GCM.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GCM.entities.Plage_Horaire;

public interface Plage_HoraireRepository extends JpaRepository<Plage_Horaire, Integer>{
	
	void deletePlage_HoraireById(int id);
	
	Optional<Plage_Horaire> findPlage_HoraireById(int id);

}

package com.GCM.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GCM.entities.Visite;

public interface VisiteRepository extends JpaRepository<Visite, Integer>{
void deleteVisiteById(int id);
	
	Optional<Visite> findVisiteById(int id);

}

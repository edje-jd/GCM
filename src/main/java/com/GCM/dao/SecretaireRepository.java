package com.GCM.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GCM.entities.Secretaire;

public interface SecretaireRepository extends JpaRepository<Secretaire, Integer>{
	
	void deleteSecretaireById(int id);
	
	Optional<Secretaire> findSecretaireById(int id);

}

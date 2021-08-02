package com.GCM.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GCM.entities.Antecedent;

public interface AntecedentRepositoy extends JpaRepository<Antecedent, Integer> {
	
	void deleteAntecedentById(int id);
	
	Optional<Antecedent> findAntecedentById(int id);
	

}

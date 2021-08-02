package com.GCM.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GCM.entities.Annalyse;

public interface AnnalyseRepository extends JpaRepository<Annalyse, Integer> {
	
	void deleteAnnalyseById(int id);
	
	Optional<Annalyse> findAnnalyseById(int id);

}

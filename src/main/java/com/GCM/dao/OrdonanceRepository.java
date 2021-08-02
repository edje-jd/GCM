package com.GCM.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GCM.entities.Ordonance;


public interface OrdonanceRepository extends JpaRepository<Ordonance, Integer>{
	
        void deleteOrdonanceById(int id);
	  
	    Optional<Ordonance> findOrdonanceById(int id);
	    
	    

}

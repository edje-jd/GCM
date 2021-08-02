package com.GCM.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GCM.entities.Medicament;

public interface MedicamentRepository extends JpaRepository<Medicament, Integer>{
	void deleteMedicamentById(int id);
	
	Optional<Medicament> findMedicamentById(int id);

}

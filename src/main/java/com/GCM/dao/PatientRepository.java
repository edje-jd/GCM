package com.GCM.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GCM.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
	
	void deletePatientById(int id);
	
	Optional<Patient> findPatientById(int id);

}

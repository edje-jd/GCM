package com.GCM.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GCM.entities.Patient;
import com.GCM.entities.PatientDesease;

public interface PatientDeseaseRepository extends JpaRepository<PatientDesease, Long> {

void deletePatientDeseaseById(Long id);



Optional<PatientDesease> findPatientDeseaseById(Long id);
	
	
	
}

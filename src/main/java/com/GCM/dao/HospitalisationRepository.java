package com.GCM.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GCM.entities.Hospitalisation;

public interface HospitalisationRepository extends JpaRepository<Hospitalisation, Integer>{
  void deleteHospitalisationById(int id);
  
  Optional<Hospitalisation> findHopitalisationById(int id);
}

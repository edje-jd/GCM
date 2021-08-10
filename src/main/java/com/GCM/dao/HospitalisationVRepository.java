package com.GCM.dao;

import com.GCM.entities.Annalyse;
import com.GCM.entities.HospitalisationV;
import com.GCM.entities.PatientDesease;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HospitalisationVRepository extends JpaRepository<HospitalisationV, Integer> {

    void deleteHospitalisationVById(Long id);



    Optional<HospitalisationV> findHospitalisationVById(Long id);
}

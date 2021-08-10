package com.GCM.dao;

import com.GCM.entities.MedecinPH;
import org.springframework.data.jpa.repository.JpaRepository;

import com.GCM.entities.OrdonanceMV;

import java.util.Optional;

public interface OrdonanceMVRepository extends JpaRepository<OrdonanceMV, Long> {
    void deleteOrdonanceMVById(Long id);



    Optional<OrdonanceMV> findOrdonanceMVById(Long id);

}

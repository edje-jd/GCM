package com.GCM.dao;

import com.GCM.entities.Visite;
import org.springframework.data.jpa.repository.JpaRepository;

import com.GCM.entities.VisitePM;

import java.util.Optional;

public interface VisitePMRepository extends JpaRepository<VisitePM, Long>{

    void deleteVisitePMById(long id);

    Optional< VisitePM> findVisitePMById(long id);
}

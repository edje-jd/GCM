package com.GCM.dao;

import com.GCM.entities.Annalyse;
import com.GCM.entities.AnnalyseV;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnalyseVRepository extends JpaRepository<AnnalyseV, Long>{
    void deleteAnnalyseVById(Long id);

}

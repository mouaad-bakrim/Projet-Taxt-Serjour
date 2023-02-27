package com.example.demo.dao;

import com.example.demo.bean.Rue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RueDao extends JpaRepository<Rue,Long> {
    List<Rue> findAll();
    Rue findByQuartiereCode(Double code);
   int save(Rue rue);
    Rue findByCode(Double code);
     int deleteByCode(Double code);
}
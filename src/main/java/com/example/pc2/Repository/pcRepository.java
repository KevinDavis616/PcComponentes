package com.example.pc2.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.pc2.Models.pcModels;


@Repository
public interface pcRepository extends CrudRepository<pcModels, Integer> {
    
}
package com.example.pc2.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.pc2.Models.pcModels;
import com.example.pc2.Repository.pcRepository;

@Service

public class pcServices {
    
    @Autowired

    pcRepository pcRepository;

   public pcModels guardarComponente(pcModels componentes) {
        return pcRepository.save(componentes);
   }

   public boolean borrar(Integer Id) {
    try{
    pcRepository.deleteById(Id);
    return true;
    }catch(Exception e) {
        return false;
    }
   }

   public ArrayList<pcModels> obtenerComponentes() {
    return (ArrayList<pcModels>) pcRepository.findAll();
   }

   public Optional<pcModels> obtenerPorId(Integer Id){
    return pcRepository.findById(Id);
   }

}


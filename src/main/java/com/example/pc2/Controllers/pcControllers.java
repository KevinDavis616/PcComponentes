package com.example.pc2.Controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pc2.Models.pcModels;
import com.example.pc2.Services.pcServices;

@RestController
@RequestMapping

public class pcControllers {
    @Autowired  
    
    pcServices pcServices;
    
    @PostMapping("/agregar")
    public pcModels guardarComponente(@RequestBody pcModels componentes) {
        return this.pcServices.guardarComponente(componentes);
    }

    @GetMapping("/mostrarTodo")
    public ArrayList<pcModels> obtenerComponentes(){
        return pcServices.obtenerComponentes();
    }
    @GetMapping(path="/{Id}")
    public Optional<pcModels> obtenerPorId(@PathVariable("Id") Integer Id){
        return this.pcServices.obtenerPorId(Id);
    }
    @DeleteMapping(path="/{Id}")
    public String eliminarComponente(@PathVariable("Id")Integer Id){
        boolean ok = this.pcServices.borrar(Id);
        if (ok){
            return "El Componente ha sido eliminado";
        } else {
            return "El Componente no se encuentra en el registro";
        }
    }
}
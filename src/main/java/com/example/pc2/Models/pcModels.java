package com.example.pc2.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "Componentes")

public class pcModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int Id;
    private String CPU;
    private String PlacaMadre;
    private String RAM;
    private String Almacenamiento;
    private String PowerSupply;
    private String Enfriamiento;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String cPU) {
        CPU = cPU;
    }

    public String getPlacaMadre() {
        return PlacaMadre;
    }

    public void setPlacaMadre(String placaMadre) {
        PlacaMadre = placaMadre;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String rAM) {
        RAM = rAM;
    }

    public String getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        Almacenamiento = almacenamiento;
    }

    public String getPowerSupply() {
        return PowerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        PowerSupply = powerSupply;
    }

    public String getEnfriamiento() {
        return Enfriamiento;
    }

    public void setEnfriamiento(String enfriamiento) {
        Enfriamiento = enfriamiento;
    }

}

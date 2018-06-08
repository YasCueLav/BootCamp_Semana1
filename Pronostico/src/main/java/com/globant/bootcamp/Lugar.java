/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.globant.bootcamp.pronostico;

/**
 *
 * @author Yasmin
 */
public class Lugar {
    String pais;
    String region;
    String ciudad;

    public Lugar() {
    }

    public Lugar(String pais, String region, String ciudad) {
        this.pais = pais;
        this.region = region;
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public String getRegion() {
        return region;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}

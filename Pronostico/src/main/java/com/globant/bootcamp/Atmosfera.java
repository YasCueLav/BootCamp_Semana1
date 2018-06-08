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
public class Atmosfera {
    String atmoHumedad;
    String atmoPresion;
    String atmoVisibilidad;

    public Atmosfera() {
    }

    public Atmosfera(String atmoHumedad, String atmoPresion, String atmoVisibilidad) {
        this.atmoHumedad = atmoHumedad;
        this.atmoPresion = atmoPresion;
        this.atmoVisibilidad = atmoVisibilidad;
    }

    public String getAtmoHumedad() {
        return atmoHumedad;
    }

    public String getAtmoPresion() {
        return atmoPresion;
    }

    public String getAtmoVisibilidad() {
        return atmoVisibilidad;
    }

    public void setAtmoHumedad(String atmoHumedad) {
        this.atmoHumedad = atmoHumedad;
    }

    public void setAtmoPresion(String atmoPresion) {
        this.atmoPresion = atmoPresion;
    }

    public void setAtmoVisibilidad(String atmoVisibilidad) {
        this.atmoVisibilidad = atmoVisibilidad;
    }
}


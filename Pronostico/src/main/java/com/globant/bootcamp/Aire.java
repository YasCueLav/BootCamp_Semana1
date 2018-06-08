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
public class Aire {
    String vientoFrio;
    String vientoDireccion;
    String vientoVelocidad;

    public Aire() {
    }

    public Aire(String vientoFrio, String vientoDireccion, String vientoVelocidad) {
        this.vientoFrio = vientoFrio;
        this.vientoDireccion = vientoDireccion;
        this.vientoVelocidad = vientoVelocidad;
    }

    public String getVientoFrio() {
        return vientoFrio;
    }

    public String getVientoDireccion() {
        return vientoDireccion;
    }

    public String getVientoVelocidad() {
        return vientoVelocidad;
    }

    public void setVientoFrio(String vientoFrio) {
        this.vientoFrio = vientoFrio;
    }

    public void setVientoDireccion(String vientoDireccion) {
        this.vientoDireccion = vientoDireccion;
    }

    public void setVientoVelocidad(String vientoVelocidad) {
        this.vientoVelocidad = vientoVelocidad;
    }
}

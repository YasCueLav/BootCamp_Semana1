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
public class Clima {
    String fecha;
    String tempMax;
    String tempMin;
    String descripcion;

    public Clima() {
    }

    public Clima(String fecha, String tempMax, String tempMin, String descripcion) {
        this.fecha = fecha;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTempMax() {
        return tempMax;
    }

    public String getTempMin() {
        return tempMin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTempMax(String tempMax) {
        this.tempMax = tempMax;
    }

    public void setTempMin(String tempMin) {
        this.tempMin = tempMin;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

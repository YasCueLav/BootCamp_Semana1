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
public class Medida {
    String medidaTemp;
    String medidaVelocidas;
    String medidaPrecion;
    String medidaDistancia;

    public Medida() {
    }

    public Medida(String medidaTemp, String medidaVelocidas, String medidaPrecion, String medidaDistancia) {
        this.medidaTemp = medidaTemp;
        this.medidaVelocidas = medidaVelocidas;
        this.medidaPrecion = medidaPrecion;
        this.medidaDistancia = medidaDistancia;
    }

    public String getMedidaTemp() {
        return medidaTemp;
    }

    public String getMedidaVelocidas() {
        return medidaVelocidas;
    }

    public String getMedidaPrecion() {
        return medidaPrecion;
    }

    public String getMedidaDistancia() {
        return medidaDistancia;
    }

    public void setMedidaTemp(String medidaTemp) {
        this.medidaTemp = medidaTemp;
    }

    public void setMedidaVelocidas(String medidaVelocidas) {
        this.medidaVelocidas = medidaVelocidas;
    }

    public void setMedidaPrecion(String medidaPrecion) {
        this.medidaPrecion = medidaPrecion;
    }

    public void setMedidaDistancia(String medidaDistancia) {
        this.medidaDistancia = medidaDistancia;
    }
    
}

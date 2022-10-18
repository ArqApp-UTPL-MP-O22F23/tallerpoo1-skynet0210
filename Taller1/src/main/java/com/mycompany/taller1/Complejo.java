/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1;

/**
 *
 * @author mauro
 */
public class Complejo {
    
    private float real;
    private float imaginario;
    
    public Complejo(float real, float imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }
    
    public Complejo() {
        this.real = 1;
        this.imaginario = 1;
    }

    public float getReal() {
        return real;
    }

    public float getImaginario() {
        return imaginario;
    }

    public void setReal(float real) {
        this.real = real;
    }

    public void setImaginario(float imaginario) {
        this.imaginario = imaginario;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format("%.0f + %.0f", getReal(),getImaginario());
    }
    
}

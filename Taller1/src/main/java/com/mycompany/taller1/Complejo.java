/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1;

/**
 *
 * @author mauro
 */
public class Complejo implements ComplejosInterface {
    
    private float real;
    private float imaginario;
    private float SumaReales;
    private float SumaImaginarios;
    private float RestaReales;
    private float RestaImaginarios;
    
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
    
    
    @Override
    public String toString() {
        return String.format("%.0f + %.0fi", getReal(),getImaginario());
    }

    @Override
    public Complejo sumarNumComplejos(Complejo numero1, Complejo numero2) {
        SumaReales  = numero1.real + numero2.real; 
	SumaImaginarios = numero1.imaginario + numero2.imaginario;
        
        return new Complejo(SumaReales, SumaImaginarios);
    }

    @Override
    public Complejo restarNumComplejos(Complejo numero1, Complejo numero2) {
        RestaReales  = numero1.real - numero2.real ; 
	RestaImaginarios = numero1.imaginario - numero2.imaginario;
        
        return new Complejo(RestaReales, RestaImaginarios);
    }
    
}

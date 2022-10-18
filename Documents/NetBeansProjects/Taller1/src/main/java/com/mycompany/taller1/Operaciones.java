/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1;

/**
 *
 * @author mauro
 */
public class Operaciones implements ComplejosInterface {
    
    Complejo num1 = new Complejo();
    Complejo num2 = new Complejo(2, 9);
    
    @Override
    public void sumarNumComplejos(){
        
        System.out.println("Suma de complejos: (" + num1 + ") + (" + num2 + ")");
        System.out.print("R = ");
        System.out.printf("%.0f + %.0fi", 
				num1.getReal() + num2.getReal(), 
				num1.getImaginario() + num2.getImaginario());
    }
    
    @Override
    public void restarNumComplejos() {
		
        System.out.println("\nResta de complejos: (" + num1 + ") - (" + num2 + ")");
	System.out.print("R = ");
	System.out.printf("%.0f + %.0fi",
				num1.getReal() - num2.getReal(), 
				num1.getImaginario() - num2.getImaginario());
		
	}

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1;

/**
 *
 * @author mauro
 */
public class ComplejosImplementacion {
    public static void main(String[] args) {
        
        
        Complejo ecua1 = new Complejo(1,8);
        Complejo ecua2 = new Complejo(2,9);
        Complejo operacion = new Complejo();
        Complejo resultado;
        
        System.out.println("**Suma de números Complejos**");
        resultado = operacion.sumarNumComplejos(ecua1, ecua2);
        System.out.printf("Resultado == %.0f + %.0fi\n",
                            resultado.getReal(), resultado.getImaginario());
        System.out.println("**Resta de números Complejos**");
        resultado = operacion.restarNumComplejos(ecua1, ecua2);
        System.out.printf("Resultado == %.0f + %.0fi\n",
                            resultado.getReal(), resultado.getImaginario());
          
    }
    
    
}

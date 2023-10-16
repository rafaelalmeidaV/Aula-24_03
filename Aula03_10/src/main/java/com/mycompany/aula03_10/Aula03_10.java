/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula03_10;

/**
 *
 * @author rafap
 */
public class Aula03_10 {

    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;
        
        try{
            novaFrase = frase.toUpperCase();
        }
        catch(NullPointerException e){
            System.err.println("Execção: " + e);
            System.out.println("A frase inicial esta nula. Foi inserido um valor default");
            
            frase = "Frase vazia";
        }
        
        finally{
            novaFrase = frase.toUpperCase();
        }
        
        System.out.println("Frase antiga: " + frase);
        System.out.println("Nova Frase "+ novaFrase);
        
    }
}

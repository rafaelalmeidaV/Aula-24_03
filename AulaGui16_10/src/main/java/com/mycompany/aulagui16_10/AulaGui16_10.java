/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulagui16_10;

import javax.swing.JOptionPane;

/**
 *
 * @author rafap
 */
public class AulaGui16_10 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        
        int op = JOptionPane.showConfirmDialog(null, "Seu nome é "+ nome+"?");
        
        if(op == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Dado Cadastrado com sucesso");
        }
        
        if(op == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Dado Negado");
        }
        
        if(op == JOptionPane.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null, "Cancelado");
        }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.insituciondeeducacionsuperior;

/**
 *
 * @author santi
 */
public class MatriculaPosgrado implements Matriculable {
    private int valorCreditoPosgrado=200000;

    @Override
    public double calcularMatricula(double promedio) {
     double valor=0;   
     double aux;
     double auxDescuento1=0.20;
        if (promedio>=4.5) {
            valor=20*valorCreditoPosgrado;
            aux= valor * auxDescuento1;
            valor=valor-aux;
         
        }
        else if (promedio<4.5) {
            valor=10*valorCreditoPosgrado;
 
        }
        return valor;
        
    }

    /**
     * @return the valorCreditoPosgrado
     */
    public int getValorCreditoPosgrado() {
        return valorCreditoPosgrado;
    }

    /**
     * @param valorCreditoPosgrado the valorCreditoPosgrado to set
     */
    public void setValorCreditoPosgrado(int valorCreditoPosgrado) {
        this.valorCreditoPosgrado = valorCreditoPosgrado;
    }
    
}

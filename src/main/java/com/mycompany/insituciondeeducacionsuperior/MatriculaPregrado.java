/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.insituciondeeducacionsuperior;

/**
 *
 * @author santi
 */
public class MatriculaPregrado implements Matriculable {
    private int valorCreditoPregrado=40000;

    public MatriculaPregrado() {}
    
    @Override
    public double calcularMatricula(double promedio) {
     double valor=0;   
     double aux;
     double auxDescuento1=0.25;
     double auxDescuento2=0.10;
        if (promedio>=4.5){
            valor=28*valorCreditoPregrado;
            aux= valor * auxDescuento1;
            valor=valor-aux;
        }
        else if(promedio>=4.0 && promedio<4.5){
            valor=25*valorCreditoPregrado;
            aux= valor * auxDescuento2;
            valor=valor-aux;
        }
        else if (promedio>=3.5 && promedio<4.0) {
            valor=20*valorCreditoPregrado;
        }
        else if(promedio>=2.5 && promedio<3.5){
            valor=15*valorCreditoPregrado;
        }
        else if(promedio<2.5){
            valor=0;
        }
        
        
        return valor;
    }

    /**
     * @return the valorCreditoPregrado
     */
    public int getValorCreditoPregrado() {
        return valorCreditoPregrado;
    }

    /**
     * @param valorCreditoPregrado the valorCreditoPregrado to set
     */
    public void setValorCreditoPregrado(int valorCreditoPregrado) {
        this.valorCreditoPregrado = valorCreditoPregrado;
    }

    
    
}

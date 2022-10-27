/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.insituciondeeducacionsuperior;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class InsitucionDeEducacionSuperior {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombresMain;
        String apellidosMain;
        String facultadMain;
        String programaMain;
        double notaFisica;
        double notaCalculo;
        double notaEstadistica;
        int codigoMain;
        double promedioMain;
        int creditosMain = 0; 
        double valorMain = 0;
        
        System.out.println("Programa para estimular a los estudiantes");
        System.out.println("---BIENVENIDO--");
        System.out.println("Ingrese los nombres del estudiante");
        nombresMain=in.nextLine();
        System.out.println("Ingrese los apellidos del estudiante");
        apellidosMain=in.nextLine();
        System.out.println("Ingrese la facultad del estudiante");
        facultadMain=in.nextLine();
         System.out.println("Ingrese el programa al que pertenece 1.PREGRADO/2.POSGRADO");
        programaMain=in.nextLine();
        System.out.println("Ingrese el codigo del estudiante");
        codigoMain=in.nextInt();
        System.out.println("Ingrese la nota para fisica");
        notaFisica= in.nextDouble();
        System.out.println("Ingrese la nota para calculo");
        notaCalculo= in.nextDouble();
        System.out.println("Ingrese la nota para estadistica");
        notaEstadistica= in.nextDouble();
        
        
        Estudiante estudiante1= new Estudiante(nombresMain, apellidosMain, facultadMain, programaMain, codigoMain);
        promedioMain= estudiante1.calcularPromedio(notaFisica, notaCalculo, notaEstadistica);
        
        if(programaMain.equals("PREGRADO")){
            if (promedioMain>=4.5){
                Matriculable matricula1= new MatriculaPregrado();
                valorMain= matricula1.calcularMatricula(promedioMain);
                creditosMain=28;
            }
            else if(promedioMain>=4.0 && promedioMain<4.5){
                Matriculable matricula1= new MatriculaPregrado();
                valorMain= matricula1.calcularMatricula(promedioMain);
                creditosMain=25;
            }
            else if (promedioMain>=3.5 && promedioMain<4.0) {
                Matriculable matricula1= new MatriculaPregrado();
                valorMain= matricula1.calcularMatricula(promedioMain);
                creditosMain=20;
            }
            else if(promedioMain>=2.5 && promedioMain<3.5){
                Matriculable matricula1= new MatriculaPregrado();
                valorMain= matricula1.calcularMatricula(promedioMain); 
                creditosMain=15;
            }
            else if(promedioMain<2.5){
                creditosMain=0;
                System.out.println("El estudiante no puede ser matriculado");
            }
        }
        if (programaMain.equals("POSGRADO")) {
            if (promedioMain>=4.5) {
                Matriculable matricula2= new MatriculaPosgrado();
                valorMain= matricula2.calcularMatricula(promedioMain);
                creditosMain=20;
        }
        else if (promedioMain<4.5) {
                Matriculable matricula2= new MatriculaPosgrado();
                valorMain= matricula2.calcularMatricula(promedioMain);
                creditosMain=10;
 
        }
         
        }
        
        System.out.println("----DATOS----"+estudiante1+ "EL PROMEDIO ES: " + promedioMain+  "El valor a pagar es: "+ valorMain+ "CREDITOS: "+creditosMain);  
        
        
    }
}

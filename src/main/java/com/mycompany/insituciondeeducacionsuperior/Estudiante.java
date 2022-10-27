/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.insituciondeeducacionsuperior;

/**
 *
 * @author santi
 */
public  class Estudiante {
    private String nombres;
    private String apellidos;
    private String falcutad;
    private String programa; 
    private int codigo;
    private double promedio;

    public Estudiante(String nombres, String apellidos, String falcutad, String programa, int codigo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.falcutad = falcutad;
        this.programa = programa;
        this.codigo = codigo;
    }
    public double calcularPromedio(double fisica, double calculo, double estadistica){
        
        promedio=(fisica + calculo+ estadistica)/3;
        return promedio;
    }
    public double calcularMatricula(Matriculable matricula){
      
        return 0.2;
    }
    

    
    
    
    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the falcutad
     */
    public String getFalcutad() {
        return falcutad;
    }

    /**
     * @param falcutad the falcutad to set
     */
    public void setFalcutad(String falcutad) {
        this.falcutad = falcutad;
    }

    /**
     * @return the programa
     */
    public String getPrograma() {
        return programa;
    }

    /**
     * @param programa the programa to set
     */
    public void setPrograma(String programa) {
        this.programa = programa;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return  "NOMBRES=" + nombres + ", APELLIDOS=" + apellidos + ", FACULTAD=" + falcutad + ", PROGRAMA=" + programa + ", CODIGO=" + codigo;
    }
    
    
}

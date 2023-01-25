package com.tearea1enero;

public class Profesor extends Persona{
    //instanciamiento de variables
    private String departamento;
    private int idlicencia;

    //constructor sin argumentos
    public void Profesor(){

    }

    //constructor con argumentos
    public Profesor(String nombre, String apellidos, String genero, int edad, double altura, String departamento, int idlicencia){

        super(nombre, apellidos, genero, edad, altura); //llamada al método constructor de la clase padre
        this.departamento = departamento;
        this.idlicencia = idlicencia;

    }

    //getters
    protected void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    protected void setIdlicencia(int idlicencia){
        this.idlicencia = idlicencia;
    }

    //setters
    protected String getDepartamento(){return departamento;}
    protected int getIdlicencia(){return idlicencia;}
}

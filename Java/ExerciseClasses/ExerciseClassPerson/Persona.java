package com.tearea1enero;


public class Persona { //clase persona

    //atributos

    protected String nombre, apellidos, genero;
    protected int edad;
    protected double altura;


    //constructor sin parámetros
    public Persona(){

    }


    //constructor con parámetros
    public Persona(String nombre, String apellidos, String genero, int edad, double altura){




    }

    //setters
    protected void setNombre(String nombre){
        this.nombre= nombre;
    }
    protected void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    protected void setGenero(String genero){
        this.genero = genero;
    }
    protected void setEdad(int edad){
        this.edad = edad;
    }
    protected void setAltura(double altura){
        this.altura = altura;
    }

    //getters

    protected String getNombre(){
        return nombre;
    }
    protected String getApellidos(){
        return apellidos;
    }
    protected String getGenero(){
        return genero;
    }
    protected int getEdad(){
        return edad;
    }
    protected double getAltura(){
        return altura;
    }



}

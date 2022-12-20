package com.example.op;

public class Moto { //nombre de la clase

    //atributos
    private String color, marca;
    private Double kilometraje;
    private int peso;


    //métodos getters y setters

    public void setColor(String color){
        this.color = color;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }

    public void setKilometraje(Double kilometraje){
        this.kilometraje = kilometraje;
    }
    public String getAtributo1() {
        return color;
    }
    public String getAtributo2() {
        return marca;
    }
    public int getAtributo3() {
        return peso;
    }
    public Double getAtributo4() {
        return kilometraje;
    }



}

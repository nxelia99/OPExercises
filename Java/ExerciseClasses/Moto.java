package tarea1Diciembre;

public class Moto { //nombre de la clase

    //atributos
    private String color, marca;
    private Double kilometraje;
    private int peso;


    //métodos getters y setters

    protected void setColor(String color){
        this.color = color;
    }

    protected void setMarca(String marca){
        this.marca = marca;
    }

    protected void setPeso(int peso){
        this.peso = peso;
    }

    protected void setKilometraje(Double kilometraje){
        this.kilometraje = kilometraje;
    }
    protected String getAtributo1() {
        return color;
    }
    protected String getAtributo2() {
        return marca;
    }
    protected int getAtributo3() {
        return peso;
    }
    protected Double getAtributo4() {
        return kilometraje;
    }



}

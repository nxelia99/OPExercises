package com.tareamayo;

public class Modulo {
    //atributos
    private int idModulo;
    private String nomModulo;
    private int numHoras;
    private String nomProfe;
    private int numUnit;
    private int notaFinal;

    public Modulo(int idModulo, String nomModulo, int numHoras, String nomProfe, int numUnit, int notaFinal){
        this.idModulo = idModulo;
        this.nomModulo = nomModulo;
        this.numHoras = numHoras;
        this.nomProfe = nomProfe;
        this.notaFinal = notaFinal;
    }


    //setters

    protected void setIdModulo(int idModulo){
        this.idModulo = idModulo;
    }
    protected void setNomModulo(String nomModulo){
        this.nomModulo = nomModulo;
    }
    protected void setNumHoras(int numHoras){
        this.numHoras = numHoras;
    }
    protected void setNomProfe(String nomProfe){
        this.nomProfe = nomProfe;
    }
    protected void setNotaFinal(int notaFinal){
        this.notaFinal = notaFinal;
    }

    //getters

    protected int getIdModulo(){
        return idModulo;
    }
    protected String getNomModulo(){
        return nomModulo;
    }
    protected int getNumHoras(){
        return numHoras;
    }
    protected String getNomProfe(){
        return nomProfe;
    }
    protected int getNotaFinal(){
        return notaFinal;
    }
}

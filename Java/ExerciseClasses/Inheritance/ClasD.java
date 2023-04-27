package com.tareaabrilprogramacion;

public class ClasD extends ClasB implements InterA, InterB{
    private final int atr1_clasD = 3;
    private double atr2_clasD;
    private String atr3_clasD;
    public ClasD(EnumA enum1, int atr1_clasA, String atr2_clasA, int atr1_clasD, double atr2_clasD, String atr3_clasD) {
        super(enum1, atr1_clasA, atr2_clasA);
        this.atr2_clasD = atr2_clasD;
        this.atr3_clasD = atr3_clasD;
    }

    public int getAtr1_clasD(){
        return atr1_clasD;
    }

    public double getAtr2_clasD(){
        return atr2_clasD;
    }
    public void setAtr2_clasD(double atr2_clasD){
        this.atr2_clasD = atr2_clasD;
    }
    public String getAtr3_clasD(){
        return atr3_clasD;
    }
    public void setAtr3_clasD(String atr3_clasD){
        this.atr3_clasD = atr3_clasD;
    }

    @Override
    public EnumA getEnum1() {
        return super.getEnum1();
    }

    @Override
    public void setEnum1(EnumA enum1) {
        super.setEnum1(enum1);
    }

    @Override
    public double metodoAbsClasB(int numero) {
        return numero * atr1_clasD;
    }

    @Override
    public String toString(){
        return super.toString() + "\nClasD: atr1_clasD: " + atr1_clasD + ", atr2_clasD: " + atr2_clasD + ", atr3_clasD: " + atr3_clasD + " de tipo String en objD";
    }
    public void printA(String text){
        System.out.println("método de la interfaz B en la clase D");
    }

    public void printB(String textB) {
        System.out.println("método de la interface B en clasE");
    }
}

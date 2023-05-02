// 1. Clase NO abstracta.
public class ClasD extends ClasB implements InterA, InterB{

    // 2. 1atributo de tipo entero y fijo(no se puede modificar) e inicializado a 5. . (este valor
    //fijo sera usado para realizar calculos dentro de un metodo abstracto)
    private final int atr1_clasD = 5;

    //3. 2 atributos, uno de tipo double y otro tipo String.
    private double atr2_clasD;
    private String atr3_clasD;

    //4. Constructor con el total de parametros.
    public ClasD(EnumA enum1, int atr1_clasA, String atr2_clasA, double atr2_clasD, String atr3_clasD, String nombre) {
        super(enum1, atr1_clasA, atr2_clasA, nombre);
        this.atr2_clasD = atr2_clasD;
        this.atr3_clasD = atr3_clasD;
    }

    //5. Métodos getter y setter para cada atributo.
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

    //6. Metodos abstractos que habra que implementar (procedentes de otra clase e
    //interfaces
    @Override
    public double metodoAbsClasB(int numero) {
        return numero * atr1_clasD;
    }

    public void printA(String text){
        System.out.println("método de la interfaz B en la clase D");
    }

    public void printB(String textB) {
        System.out.println("método de la interface B en clasE");
    }

    //7. Reescritura del metodo toString para mostrar los datos de esta clase pero tambien
    //se debe usar el metodo toString del padre(super.toString()).

    @Override
    public String toString(){
        return super.toString() + "\nClasD: atr1_clasD: " + atr1_clasD + ", atr2_clasD: " + atr2_clasD + ", atr3_clasD: " + atr3_clasD + " de tipo String en ObjD";
    }

}

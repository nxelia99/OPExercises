//1. Clase NO abstracta.
public class ClasC extends ClasA{


    //2. 2 atributos, uno tipo entero y otro tipo true o false.
    protected int atr1_clasC;
    protected boolean atr2_clasC;

    //3. Constructor con el total de parametros.

    public ClasC(int atr1_clasC, boolean atr2_clasC, int atr1_clasA, String atr2_clasA, String nombre) {
        super(atr1_clasA, atr2_clasA, nombre);
        this.atr1_clasC = atr1_clasC;
        this.atr2_clasC = atr2_clasC;
    }


    //4. Métodos getter y setter para cada atributo.

    public int getAtr1_clasC() {
        return atr1_clasC;
    }

    public void setAtr1_clasC(int atr1_clasC) {
        this.atr1_clasC = atr1_clasC;
    }

    public boolean isAtr2_clasC() {
        return atr2_clasC;
    }

    public void setAtr2_clasC(boolean atr2_clasC) {
        this.atr2_clasC = atr2_clasC;
    }

    //5. Reescritura del metodo toString para mostrar los datos de esta clase pero tambien
    //se debe usar el metodo toString del padre(super.toString()

    @Override
    public String toString(){
        return super.toString() + "\nClasC: atr1_clasC: " + atr1_clasC + ", atr2_clasC: " + atr2_clasC;
    }


}

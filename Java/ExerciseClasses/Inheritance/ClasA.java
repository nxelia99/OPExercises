//1. Clase abstracta.
public abstract class ClasA {

    //2. 2 atributos, uno tipo entero y otro tipo String.

    protected int atr1_clasA;
    protected String atr2_clasA;

    //3. 1 atributo de clase de tipo entero, que servirá para contabilizar el numero de
    //objetos de tipo ClasA que se han creado del tipo que sean (ClasB, ClasC, ClasD o
    //ClasE).
    protected static int contadorA = 0;
    private String nombre;

    //4. Constructor con el total de parametros.
    public ClasA(int atr1_clasA, String atr2_clasA, String nombre) {
        super();
        this.atr1_clasA = atr1_clasA;
        this.atr2_clasA = atr2_clasA;
        this.nombre = nombre;
        contadorA++;
    }

    //5. Metodos getter y setter para cada atributo.

    public int getAtr1_clasA() {
        return atr1_clasA;
    }

    public void setAtr1_clasA(int atr1_clasA) {
        this.atr1_clasA = atr1_clasA;
    }

    public String getAtr2_clasA() {
        return atr2_clasA;
    }

    public void setAtr2_clasA(String atr2ClasA) {
        this.atr2_clasA = atr2ClasA;
    }

    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    public static int getContadorA() {
        return contadorA;
    }
    public static void setContadorA(int contadorA){
        ClasA.contadorA = contadorA;
    }


    //6. Reescritura del metodo toString para mostrar los datos de esta clase
    @Override
    public String toString() {
        return "ClasA: " + "atr1_clasA: " + atr1_clasA + ", atr2_clasA: " + atr2_clasA + " de tipo String en " + nombre;
    }
}

//1. Clase NO abstracta.

public class ClasE extends ClasB implements InterB{

    //2. 1atributo de tipo entero y fijo(no se puede modificar) e inicializado a 10. (este valor
    //fijo sera usado para realizar calculos dentro de un metodo abstracto).
    protected static int atr1_clasE = 10;

    //3. 2 atributos, uno de tipo String y otro tipo String
    protected String atr2_clasE;
    protected String atr3_clasE;

    //4. Constructor con el total de parametros.
    public ClasE(EnumA enum1, int atr1_clasA, String atr2_clasA, int atr1_clasE, String atr2_clasE, String atr3_clasE) {
        super(enum1, atr1_clasA, atr2_clasA);
        this.atr1_clasE = atr1_clasE;
        this.atr2_clasE = atr2_clasE;
        this.atr3_clasE = atr3_clasE;
    }



    //5. Metodos getter y setter para cada atributo

    //6. Metodos abstractos que habra que implementar (procedentes de otra clase e
    //interface).
    @Override
    public double metodoAbsClasB(int numero) {
        return 0;
    }

    //7. Reescritura del metodo toString para mostrar los datos de esta clase pero tambien
    //se debe usar el metodo toString del padre(super.toString()).


}

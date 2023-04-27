// 1. Clase abstracta.
public abstract class ClasB extends ClasA{
    // 1atributo de tipo enumerado
    EnumA enum1 = EnumA.VALOR1;

    //Constructor con el total de parámetros
    public ClasB(EnumA enum1, int atr1_clasA, String atr2_clasA) {
        super(atr1_clasA, atr2_clasA);
        this.enum1 = enum1;
    }

    //Métodos getter y setter para cada atributo.

    public EnumA getEnum1() {
        return enum1;
    }

    public void setEnum1(EnumA enum1) {
        this.enum1 = enum1;
    }

    //1 método abstracto que reciba un parámetro entero y devuelva un número con
    //decimales resultado de realizar la operación siguiente:
    //(valor del parametro multiplicado por la constante indicada en la clase que
    //implementa el método). Ten en cuenta donde se declaran y donde se implementan
    //los métodos abstractos.

    public abstract double metodoAbsClasB(int numero);



    //6. Reescritura del método toString para mostrar los datos de esta clase pero también
    //se debe usar el método toString del padre(super.toString()).

    @Override
    public String toString() {
        return super.toString() + "ClasB: " + "atr1_clasB: " + atr1_clasA + ", atr2_clasA: " + atr2_clasA + " de tipo String en ";
    }


}

// 1. Clase abstracta.
public abstract class ClasB extends ClasA{
    // 1atributo de tipo enumerado
    EnumA enum1;

    //Constructor con el total de parametros
    public ClasB(EnumA enum1, int atr1_clasA, String atr2_clasA, String nombre) {
        super(atr1_clasA, atr2_clasA, nombre);
        this.enum1 = enum1;
    }

    //Metodos getter y setter para cada atributo.

    public EnumA getEnum1() {
        return enum1;
    }

    public void setEnum1(EnumA enum1) {
        this.enum1 = enum1;
    }

    //1 metodo abstracto que reciba un parametro entero y devuelva un numero con
    //decimales resultado de realizar la operacion siguiente:
    //(valor del parametro multiplicado por la constante indicada en la clase que
    //implementa el metodo). Ten en cuenta donde se declaran y donde se implementan
    //los metodos abstractos.

    public abstract double metodoAbsClasB(int numero);



    //6. Reescritura del metodo toString para mostrar los datos de esta clase pero tambien
    //se debe usar el metodo toString del padre(super.toString()).

    @Override
    public String toString() {
        return super.toString() + "\ntipoEnum: " + enum1;
    }


}

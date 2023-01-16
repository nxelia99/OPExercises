package tarea1Diciembre;


public class MotoMain {

    public static void main(String[] args) {
        //creación moto1
        Moto moto1 = new Moto();
        //declaración de los atributos
        moto1.setColor("Blanco");
        moto1.setMarca("KTM");
        moto1.setPeso(119);
        moto1.setKilometraje(175.8);
        
        System.out.println("El color de la moto1 es: " + moto1.getAtributo1());
        System.out.println("La marca de la moto1 es: " + moto1.getAtributo2());
        System.out.println("El peso de la moto1 es: " + moto1.getAtributo3());
        System.out.println("El kilometraje de la moto1 es: " + moto1.getAtributo4());
        System.out.println(moto1.acelerar(30)); // acelera

        //creación moto2
        Moto moto2 = new Moto();

        //declaración de los atributos
        moto2.setColor("Gris");
        moto2.setMarca("BMW");
        moto2.setPeso(220);
        moto2.setKilometraje(579.2);

        System.out.println("\nEl color de la moto2 es: " + moto2.getAtributo1());
        System.out.println("La marca de la moto2 es: " + moto2.getAtributo2());
        System.out.println("El peso de la moto2 es: " + moto2.getAtributo3());
        System.out.println("El kilometraje de la moto2 es: " + moto2.getAtributo4());


    }

}


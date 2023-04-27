public class Main  {

    public static void main(String[] args) {

        ClasC objC = new ClasC(3, false,4,"hola");

        System.out.println("**Datos en objC**");
        System.out.println(objC + "\n");

        ClasD objD = new ClasD(EnumA.VALOR1,3, "probando", 3, 4, "probando");

        System.out.println("**Datos en objD**");
        System.out.println(objD + "\n");

        ClasE objE = new ClasE(EnumA.VALOR3, 3, "probando E", 89, "sisi", "holahola");

        System.out.println("**Datos en objE**");
        System.out.println(objE + "\n");

        System.out.println("Total de objetos instanciados de tipo ClasA(inlcuidos los de tipo ClasB, ClasD, ClasE): ");

        System.out.println("Método abstracto declarado en clase B e implementado en ClasD que develve un " + objD.metodoAbsClasB(2));
        System.out.println("Método abstracto declarado en clase B e implementado en ClasE que develve un " + objE.metodoAbsClasB(12));




    }
}

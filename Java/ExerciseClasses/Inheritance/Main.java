public class Main  {

    public static void main(String[] args) {

        ClasC objC = new ClasC(6, false,3,"dato2A", "objC");

        System.out.println("**Datos en objC**");
        System.out.println(objC + "\n");

        ClasD objD = new ClasD(EnumA.VALOR1,5, "dato2A", 25.6, "dato3D", "objD");

        System.out.println("**Datos en objD**");
        System.out.println(objD + "\n");


        ClasE objE = new ClasE(EnumA.VALOR3, 8, "dato2A", 10, "dato1E", "dato2E", "objE");

        System.out.println("**Datos en objE**");
        System.out.println(objE + "\n");

        System.out.println("Total de objetos instanciados de tipo ClasA(inlcuidos los de tipo ClasB, ClasD, ClasE): " + ClasA.contadorA);

        System.out.println("Método abstracto declarado en clase B e implementado en ClasD que develve un " + objD.metodoAbsClasB(6));
        System.out.println("Método abstracto declarado en clase B e implementado en ClasE que develve un " + objE.metodoAbsClasB(6));




    }
}

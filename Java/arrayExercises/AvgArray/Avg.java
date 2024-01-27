import java.util.Scanner;
public class Avg {


    static void avgarray() {

        //creamos el array
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[4];
        int numerosize = numeros.length;
        int sum = 0;

        int avg = 0;
      //rellenamos array, sumamos el tatal de los valores y hacemos la media
        for (int x = 0; x < numerosize; x++) {
            System.out.println("Introduce un valor: ");
            numeros[x] = input.nextInt();
            sum += numeros[x];
            avg = sum / 4;
        }

        // calculamos la media

        System.out.println(avg);

    }

}

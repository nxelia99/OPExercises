import java.util.Scanner;
public class Sum {


    static void sumarray(){

        //creamos el array
        Scanner input = new Scanner(System.in);
        int [] numeros = new int[4];
        int numerosize = numeros.length;
      // inicializamos variable para la suma
        int sum = 0;

        for(int x = 0; x < numerosize; x++){
            System.out.println("Introduce un valor: ");
            numeros[x] = input.nextInt();
          //vamos sumando los valores que se almacenan en el array
            sum += numeros[x];

        }

        System.out.println(sum);

    }

}

import java.util.Arrays;
import java.util.Scanner;
public class Sort {


    static void intsortarray(){
        // rellenamos el array con input
        Scanner input = new Scanner(System.in);
        int [ ] numeros = new int[3];
        int numerossize = numeros.length;

     //pedimos un valor hasta rellenar el array
    for(int x = 0; x < numerossize; x++){
        System.out.println("Introduce un número: ");
        numeros[x] = input.nextInt();

    }
    // ordenamos los valores del array
        Arrays.sort(numeros);
    //lo pasamos por pantalla
        System.out.println(Arrays.toString(numeros));
    }

    static void stringsortarray(){
        //rellenamos el array
        Scanner input = new Scanner(System.in);
        String [] string = new String[3];
        int stringsize = string.length;

        // pedimos valor por pantalla para rellenar el array
        for(int x=0; x < stringsize; x++){
            System.out.println("Introduce un valor: ");
            string [x] = input.nextLine();
        }
        //ordenamos el array
        Arrays.sort(string);
        //lo pasamos por pantalla
        System.out.println(Arrays.toString(string));
    }
}

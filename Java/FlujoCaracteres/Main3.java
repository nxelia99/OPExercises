package com.example.tarea1marzo;

import java.io.*;

public class Main3 {
    public static void main(String[] args) {
        try{
            FileReader fr= new FileReader("archivo.txt"); //seleccionamos archivo origen
            FileWriter fw= new FileWriter("archivo2.txt"); // archivo a crear

            int c; // en esta variable almacenaremos los caracteres del archivo de origen
            while( (c = fr.read() ) != -1) //leemos el contenido y lo escribimos en el nuevo archivo
                fw.write(c);
            fr.close();
            fw.close();
            System.out.println("Archivo copiado con éxito");

        }catch(IOException e){
            System.out.println("Error E/S: "+ e.toString());
        }

    }
}

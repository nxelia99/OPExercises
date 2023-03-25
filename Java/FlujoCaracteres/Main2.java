package com.example.tarea1marzo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main2 {
    public static void main(String[] args) {

        BufferedReader in = null;
        PrintWriter out = null;

        try{
            in = new BufferedReader(new FileReader("archivo.txt")); //archivo fuente
            out = new PrintWriter(new FileWriter("archivo1.txt")); //archivo origen

            int c; // en esta variable almacenaremos los caracteres del archivo de origen
            while( (c = in.read() ) != -1)
                out.write(c);
            in.close();
            out.close();
            System.out.println("Archivo copiado con éxito");

        } catch (Exception e){
            System.err.println("Ha ocurrido un fallo" + e.toString()); //nos indica el error (en caso de que lo haya)

        }finally{
            System.out.println("La aplicacion ha finalizado"); //indica final
        }

    }
}

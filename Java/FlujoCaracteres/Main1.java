package com.example.tarea1marzo;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main1 {

    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;

        String rutaFicheroALeer = System.getProperty("user.dir") + "/archivo.txt";
        String rutaFicheroAEscribir = System.getProperty("user.dir") + "/copia.txt";

        try {
            in = new FileInputStream("archivo");
            out = new FileOutputStream("copia");

            int c;
            while((c=in.read()) !=-1){
                out.write(c);
            }
            System.out.println(rutaFicheroALeer);


        } catch (Exception e) {

            System.out.println("Ha ocurrido un fallo");

        } finally{

            System.out.println("la aplicacion finalizado");

    }


} }



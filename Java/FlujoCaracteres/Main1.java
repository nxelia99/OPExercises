package com.example.tarea1marzo;

import java.io.*;



public class Main1 {

    public static void main(String[] args) {

        //Establecemos la ruta usando getProperty, para que nos cree el fichero
        //en la ruta en la que estamos ahora.

        String rutaFicheroALeer = System.getProperty("user.dir") + "\\archivo.txt";
        String rutaFicheroAEscribir = System.getProperty("user.dir") + "\\copia.txt";

        System.out.println(rutaFicheroALeer);
        
        try {
            //seleccionamos los archivos que vamos a usar
            FileInputStream in = new FileInputStream(rutaFicheroALeer);
            FileOutputStream out = new FileOutputStream(rutaFicheroAEscribir);


            int c; // en esta variable almacenaremos los caracteres del archivo de origen
            while( (c = in.read() ) != -1)
                out.write(c);
                in.close();
                out.close();
            System.out.println("Archivo copiado con éxito");




        } catch (Exception e) {

            System.err.println("Ha ocurrido un fallo" + e.toString());

        } finally{

            System.out.println("La aplicacion ha finalizado");

        }


} }



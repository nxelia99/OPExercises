package com.example.tarea1ac;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Fichero {


    public static void leer(String nombre) throws IOException {

        FileReader fr = null;
        BufferedReader br = null;
        File file = new File("C:\\EjerciciosProgramacion\\" + nombre);

        //si encuentra el archivo, se ejecuta el siguiente bloque de código

        if (file.exists()) {
            try {
                // apertura del fichero y creación del Buffer para leer
                // el contenido del archivo

                fr = new FileReader(file);
                br = new BufferedReader(fr);

                // Lectura del fichero pasándolo por consola
                String linea;
                System.out.println("-El contenido del archivo es:");

                //recorre el archivo y pasa por consola el contenido
                while ((linea = br.readLine()) != null)
                    System.out.println(linea);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            } finally {
                //cerramos el fichero
                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }

    }

    public static void estadistica(String nombre) throws IOException{

        //asignamos la ruta del archivo a buscar
        File file = new File("C:\\EjerciciosProgramacion\\" + nombre);
        BufferedReader contar = null;

        //inicializamos las variables
        int caracteres = 0;
        int lineas = 0;

        // si el sistema encuentra el archivo, se procede a ejecutar
        // el siguiente bloque de código
        if (file.exists()) {
            try {
                // apertura del fichero y creación del Buffer para recorrer
                // el contenido del archivo
            contar = new BufferedReader(new FileReader(file));
            String linea = "";

            // bucle while para que cuente tanto los caracteres como las líneas

            while((linea = contar.readLine()) != null){
                caracteres += linea.length();
                lineas++;
            }

                System.out.println("-Número de caracteres que contiene el archivo: " + caracteres);
                System.out.println("-Número de líneas que contiene el archivo: " + lineas);

            } catch (Exception e) {
                System.err.println(e.getMessage());
            } finally {
                //cerramos el fichero
                try {
                    if (null != contar) {
                        contar.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }


    }
}


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
        //si encuentra el archivo, se recorre su contenido con el buffer

        if (file.exists()) {
            try {
                // apertura del fichero y creación del Buffer para leer archivo

                fr = new FileReader(file);
                br = new BufferedReader(fr);

                // Lectura del fichero pasándolo por consola
                String linea;
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

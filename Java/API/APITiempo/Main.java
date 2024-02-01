package org.example;


import org.json.JSONObject;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try {
            //Solicitar una petición
            //creamos URL
            URL url = new URL("https://www.el-tiempo.net/api/json/v2/provincias/41");

            //abrimos conexión
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            //especificamos tipo de peticion y conectamos
            conn.setRequestMethod("GET");
            conn.connect();

            
            // almacenamos el código de respuesta de la conexión para comprobarlo
            int responseCode = conn.getResponseCode();
            //¿Petición correcta?
            if(responseCode != 200){
                throw new RuntimeException("Ocurrió un error " + responseCode);
            }else{
                //Abrir un scanner que lea el flujo de datos
                //creamos objeto stream
                String informacionString = new String();

                //objeto Scanner que añade datos del stream
                Scanner sc = new Scanner(url.openStream());
                //leemos todas las líneas del flujo de datos
                while(sc.hasNext()){
                    informacionString+= sc.nextLine() + ("\n");
                }
                sc.close();
                //creamos objeto a partir del json
                JSONObject response = new JSONObject(informacionString);

                
                //mostramos los valores que nos interesan
                System.out.println("Título: " + response.getString("title") + "\n" +
                        "Hoy: " + response.getString("today") + "\n" +
                        "Mañana: " + response.getString("tomorrow") + "\n");


            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;


public class EjemploPost {
    public static void main(String[] args) {
        try {
            //Solicitar una petición
            //creamos URL
            URL url = new URL("https://gogodev.net/ejercicios/testjava.php");

            //almacenamos claves y sus valores

            Map<String, Object> params = new LinkedHashMap<>();
            //objeto que almacena la info que enviaremos con POST
            //&elm=Hola API
            params.put("elm", "Hola API"); //primero clave, luego valor

            //codificar datos a enviar
            StringBuilder postData = new StringBuilder();
            //recorrer entradas del map y codificarlas
            //por cada entrada del map
            for(Map.Entry<String, Object> param : params.entrySet()){
                if(postData.length() != 0){
                    postData.append('&'); //&nombre de la clave, &nombre del valor
                }
                postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                postData.append('=');
                postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
            }

            //obtenemos numero bytes que vamos a enviar con el post
            byte[] postBytes = postData.toString().getBytes("UTF-8");


                //establecer httpURLConnection con la conifiguracion
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                //Enviamos la info
                //especificamos tipo de peticion y conectamos
                conn.setRequestMethod("POST");
                //especificamos tipo de contenido que estamos enviando
                conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                conn.setRequestProperty("Content-Length", String.valueOf(postBytes.length));
                conn.setDoOutput(true);
                conn.getOutputStream().write(postBytes);
                //leer la respuesta que estamos obteniendo
                Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
                for(int x = in.read(); x != -1; x = in.read()){
                    System.out.println((char) x);
                }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

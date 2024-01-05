import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClienteTCP {

    public static void main(String[] args) {
        try {
            // Crear un Socket y establecer la conexión con el servidor
            Socket socket = new Socket("localhost", 12345);

            // Establecer flujos de entrada y salida
            BufferedReader entradaServidor = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter salidaServidor = new PrintWriter(socket.getOutputStream(), true);

            // Mostrar mensaje de conexión exitosa
            System.out.println("STATUS: Conectado al servidor");

            // Enviar y recibir datos
            Scanner scanner = new Scanner(System.in);
            String mensaje;
            do {
                System.out.print("Ingrese un mensaje (FIN para cerrar): ");
                mensaje = scanner.nextLine();

                // Enviar mensaje al servidor
                System.out.println("STATUS: Enviando " + mensaje);
                salidaServidor.println(mensaje);

                // Recibir y mostrar eco del servidor
                String eco = entradaServidor.readLine();
                System.out.println("STATUS: Esperando eco");
                System.out.println(eco);
            } while (!mensaje.equals("FIN"));


            // Cerrar conexiones
            entradaServidor.close();
            salidaServidor.close();
            socket.close();
            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTCP {

    public static void main(String[] args) {
        try {
            // Crear un ServerSocket
            ServerSocket serverSocket = new ServerSocket(12345);

            System.out.println("Esperando conexiones...");

            // Esperar a que un cliente se conecte
            Socket clienteSocket = serverSocket.accept();

            System.out.println("STATUS: Conectado al servidor");

            // Establecer flujos de entrada y salida
            BufferedReader entradaCliente = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));
            PrintWriter salidaCliente = new PrintWriter(clienteSocket.getOutputStream(), true);

            // Leer y enviar datos
            String mensaje;
            while ((mensaje = entradaCliente.readLine()) != null) {
                System.out.println("Mensaje recibido del cliente: " + mensaje);

                // Enviar eco al cliente
                salidaCliente.println("Eco: " + mensaje);

                // Verificar si hay que finalizar la conexión
                if (mensaje.equals("FIN")) {
                    // Cerrar conexiones
                    System.out.println("Conexión cerrada.");
                    entradaCliente.close();
                    salidaCliente.close();
                    clienteSocket.close();
                    serverSocket.close();
                    break;
                }
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

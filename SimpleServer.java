import java.net.*;
import java.io.*;

public class SimpleServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);
            System.out.println("Server waiting for client...");

            Socket socket = server.accept();
            System.out.println("Client connected!");

            DataInputStream input =
                new DataInputStream(socket.getInputStream());

            String message = input.readUTF();
            System.out.println("Message from client: " + message);

            input.close();
            socket.close();
            server.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
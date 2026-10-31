// Save this code in SimpleServer.java
import java.net.*;
import java.io.*;
 
public class SimpleServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server waiting for client...");
 
        Socket socket = server.accept();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(
                socket.getOutputStream(), true);
 
        String message = in.readLine();
        System.out.println("Client says: " + message);
        out.println("Hello from server");
 
        socket.close();
        server.close();
    }
}
 
// Save this code separately in SimpleClient.java
import java.net.*;
import java.io.*;
 
public class SimpleClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 5000);
        PrintWriter out = new PrintWriter(
                socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
 
        out.println("Hello from client");
        System.out.println("Server says: " + in.readLine());
 
        socket.close();
    }
}

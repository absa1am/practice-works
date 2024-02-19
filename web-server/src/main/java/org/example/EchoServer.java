package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.ServerSocket;

public class EchoServer {

    public static void main(String[] args) {
        try {
            System.out.println("Waiting for the clients...");

            ServerSocket serverSocket = new ServerSocket(8080);
            Socket socket = serverSocket.accept();
            System.out.println("Listening to the client...");

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String query = reader.readLine();

            PrintWriter outWriter = new PrintWriter(socket.getOutputStream(), true);
            outWriter.println(query);
        } catch (IOException e) { 
            e.printStackTrace();
            
        }
    }

}
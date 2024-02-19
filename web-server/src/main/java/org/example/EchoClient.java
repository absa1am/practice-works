package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {

    public static void main(String[] args) {
        try {
            System.out.println("Connecting to the server...");

            Socket socket = new Socket("127.0.0.1", 8080);

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter a query: ");
            String query = reader.readLine();

            PrintWriter outWriter = new PrintWriter(socket.getOutputStream(), true);
            outWriter.println(query);

            BufferedReader inputReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(inputReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

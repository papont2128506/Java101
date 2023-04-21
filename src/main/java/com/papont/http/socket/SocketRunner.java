package com.papont.http.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;

public class SocketRunner {

    public static void main(String[] args) throws IOException {
        // http  - 80
        // https - 443
        // tcp
        InetAddress inetAddress = Inet4Address.getByName("localhost");
        try (var socket = new Socket(inetAddress, 7778);
             var outputStream = new DataOutputStream(socket.getOutputStream());
             var inputStream = new DataInputStream(socket.getInputStream())) {
            outputStream.writeUTF("Hello");
            //var response = inputStream.readAllBytes();
            System.out.println("Response from server: " + inputStream.readUTF());
        };
    }
}

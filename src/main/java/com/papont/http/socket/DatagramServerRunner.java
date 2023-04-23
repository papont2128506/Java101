package com.papont.http.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramServerRunner {

    public static void main(String[] args) throws IOException {
//        var inetAddress = Inet4Address.getByName("localhost");
        try (var datagramSocket = new DatagramSocket(7777)) {
            var buffer = new byte[512];
            var packet = new DatagramPacket(buffer, buffer.length);
            datagramSocket.receive(packet);

            System.out.println(new String(buffer));
        }
    }
}

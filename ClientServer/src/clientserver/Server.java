/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserver;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author danecek
 */
public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(3333);
        System.out.println("waiting for client");
        Socket s = ss.accept();
        Scanner scn = new Scanner(s.getInputStream());
        PrintWriter pw = new PrintWriter(s.getOutputStream());
        while (scn.hasNextLine()) {
            String mess = scn.nextLine();
            System.out.println("received: " + mess);
            pw.println(mess + " ?????");
            pw.flush();
        }
    }
}

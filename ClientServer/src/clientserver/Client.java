/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserver;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author danecek
 */
public class Client {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 3333);
        PrintWriter pw = new PrintWriter(s.getOutputStream());
        Scanner scn = new Scanner(s.getInputStream());

        while (true) {
            String mess = new Scanner(System.in).nextLine();
            System.out.println("client mess:" + mess);
            pw.println(mess);
            pw.flush();
            System.out.println("server response:" + scn.nextLine());
        }

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package readingdatafromserver;

/**
 *
 * @author 91976
 */
import java.net.*;
import java.io.*;
import java.util.*;

public class ReadingDataFromServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       try {
            // Obtain the InetAddress object for the specified host ("gurukulyoga.in")
            InetAddress ob = InetAddress.getByName("gurukulyoga.in");
            // Print the InetAddress object (This may print the IP address of the specified host)
            System.out.print(ob);

            // Create a URL object for the specified URL ("http://gurukulyoga.in/contact-us/")
            URL ob1 = new URL("http://gurukulyoga.in/contact-us/");
            // Open a connection to the URL
            URLConnection ob2 = ob1.openConnection();
            
            // Get the InputStream to read data from the URL
            InputStream isr = ob2.getInputStream();

            char k;
            // Read data from the InputStream and print it
            while ((k = (char) isr.read()) != -1)
                System.out.print(k);

            // Close the InputStream when done reading data
            isr.close();

        } catch (Exception e) {
            // Print any exceptions that occur during the process
            e.printStackTrace();
        }
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kerly Titus
 */
public class Driver {

    /** 
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     Network objNetwork = new Network();            /* Activate the network */
     objNetwork.start();
     Server objServer1 = new Server("Thread1");        
     objServer1.start();
     Server objServer2 = new Server("Thread2");        
     objServer2.start();
     Server objServer3 = new Server("Thread3");
     objServer3.start();
     Client client1 = new Client("sending");
     client1.start();
     Client client2 = new Client("receiving");
     client2.start();




 }
    
 }

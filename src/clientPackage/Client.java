package clientPackage;

import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            // La première étape : 
            System.out.println("Je suis un client pas encore connecté...");
            
            Socket socket = new Socket("192.168.0.27", 1200);
            System.out.println("Je suis un client connecté");
            
            // La dernière étape : 
            socket.close();
            
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
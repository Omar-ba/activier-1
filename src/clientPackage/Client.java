package clientPackage;

import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        
        try {
            System.out.println("Je suis un client pas encore connecté...");
            
            
            socket = new Socket("192.168.0.27", 1234); 
            System.out.println("Je suis un client connecté");
            
            Thread.sleep(3000);
            
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        } finally {
            try {
                if (socket != null) socket.close();
            } catch (Exception e) {
                System.out.println("Erreur fermeture : " + e.getMessage());
            }
        }
    
    }
}
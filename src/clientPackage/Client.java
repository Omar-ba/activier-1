package clientPackage;

import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            // La première étape : Connexion au serveur
            System.out.println("Je suis un client pas encore connecté...");
            
            // Connexion au serveur localhost sur le port 0
            Socket socket = new Socket("192.168.1.100", 0);
            System.out.println("Je suis un client connecté");
            
            // La dernière étape : Fermer socket
            socket.close();
            
        } catch (Exception e) {
            System.err.println("Erreur client : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
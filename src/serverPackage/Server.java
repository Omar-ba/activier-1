package serverPackage;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            // La première étape : Création du serveur socket
            ServerSocket server = new ServerSocket(0);
            System.out.println("Je suis un serveur en attente de la connexion d'un client");
            
            // La deuxième étape : Attente de connexion client
            Socket socket = server.accept();
            System.out.println("Un client est connecté");
            
            // La dernière étape : Fermer socket
            socket.close();
            server.close();
            
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
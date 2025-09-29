package serverPackage;


import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket server = null;
        Socket socket = null;
        
        try {
            // La première étape : Création du serveur socket
            server = new ServerSocket(1200);
            System.out.println("Je suis un serveur en attente de la connexion d'un client");
            
            // La deuxième étape : Attente de connexion client
            socket = server.accept();
            System.out.println("Un client est connecté");
            
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        } finally {
            // La dernière étape : Fermer socket
            try {
                if (socket != null) socket.close();
                if (server != null) server.close();
            } catch (Exception e) {
                System.out.println("Erreur lors de la fermeture : " + e.getMessage());
            }
        }
    }
}
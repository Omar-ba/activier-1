# TP1 – Développement d’Applications Réparties  
## Activité 1-1 : Première connexion Client/Serveur (Sockets TCP)

## Objectifs
L’objectif de cette activité est d’apprendre à établir une communication **Client/Serveur en Java** à l’aide des **sockets en mode connecté TCP**.

---

## Étapes réalisées
---
### 1. Création du serveur

 Création d’un package `serverPackage`.
 Développement de la classe **Server.java**.

#### Code complet du serveur :

```java
package serverPackage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            // La première étape : créer un socket serveur sur le port 1900
            ServerSocket serverSocket = new ServerSocket(1900);
            System.out.println("Je suis un serveur en attente la connexion d'un client ...");

            // La deuxième étape : attendre et accepter la connexion d’un client
            Socket clientSocket = serverSocket.accept();
            System.out.println("Un client est connecté");

            // La dernière étape : fermer la connexion
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

 **Résultat console attendu côté serveur :**

  ```
  Je suis un serveur en attente la connexion d'un client ...
  Un client est connecté
  ```

 **Interprétation :**

   Le premier message confirme que le serveur a démarré et attend une connexion.
   Le deuxième message apparaît lorsqu’un client s’est connecté avec succès.

---

### 2. Création du client

 Création d’un package `clientPackage`.
 Développement de la classe **Client.java**.

#### Code complet du client :

```java
package clientPackage;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            // La première étape : préparation avant connexion
            System.out.println("Je suis un client pas encore connecté…");

            // Connexion au serveur sur localhost et port 1900
            Socket socket = new Socket("0.0.0.0", 1900);
            System.out.println("Je suis un client connecté");

            // La dernière étape : fermer la connexion
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

* **Résultat console attendu côté client :**

  ```
  Je suis un client pas encore connecté…
  Je suis un client connecté
  ```

* **Interprétation :**

   + Le premier message indique que le client a été lancé mais n’est pas encore relié.
   Le deuxième message confirme que la connexion au serveur est bien établie.



---

## Conclusion

Ce TP m'a permis de prendre en main la configuration d'un projet Java avec Git et de développer une communication client/serveur via les sockets TCP. J'ai pu analyser concrètement le comportement des applications distribuées en observant les messages dans les consoles. Cette première expérience pose des bases solides pour aborder des systèmes répartis plus complexes par la suite.


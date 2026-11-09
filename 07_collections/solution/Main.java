package solution;

import java.util.LinkedList;
import java.util.List;

public class Main {

    static List<String> products = new LinkedList<>();

    static void main() {
        populateList();
        printList();
        IO.println("-------------------------");
        removePants();
        printList();
        IO.println("-------------------------");
        IO.println("Liste beinhaltet Hosen: " + listContains("Hosen"));
        appendProduct("Hosen");
        IO.println("Liste beinhaltet Hosen: " + listContains("Hosen"));
        IO.println("-------------------------");
        IO.println("Liste hat Länge: " + listLength());
    }

    static void populateList() {
        // TODO 1: Befülle die Liste "products" mit den Produkten "Schuhe", "Hosen", "Hemden", "Tshirts", "Socken"
        products.add("Schuhe");
        products.add("Hosen");
        products.add("Hemden");
        products.add("Tshirts");
        products.add("Socken");
    }

    static void printList() {
        // TODO 2: Gib den Inhalt der Liste "products" aus. Verwende dazu eine for-each Schleife
        for (String product : products) {
            IO.println(product);
        }
    }

    static void removePants() {
        // TODO 3: Entferne das Produkt "Hosen" aus der Liste
        products.remove("Hosen");
    }

    static boolean listContains(String product) {
        // TODO 4: Prüfe ob der Parameter in der Liste vorhanden ist und gib das Ergebnis zurück
        return products.contains(product); // Ersetze mich!
    }

    static void appendProduct(String product) {
        // TODO 5: Füge den übergebenen Parameter an die Liste "products" an
        products.add(product);
    }

    static int listLength() {
        // TODO 6: Gib die Länge der Liste "products" zurück
        return products.size();
    }
}
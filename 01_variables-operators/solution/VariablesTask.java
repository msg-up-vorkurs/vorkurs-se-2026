package solution;

class VariablesTask {
    void main() {

        /*
         * TODO Aufgabe 1: Deklarieren und Initialisieren Sie Variablen für die Beschreibung eines Computers
         *  (Hersteller, Preis, Farbe, Lüfter, Arbeitsspeicher, etc.).
         */
        String manufacturer = "Apple";
        String color = "silver";
        float screenSize = 13.6F;
        byte coreCount = 8;
        byte ram = 24;
        short storage = 1024;
        boolean fan = false;
        double retailPrice = 2099.00;

        /*
         * TODO Aufgabe 1: Ausgabe der Variablen
         *  z.B. IO.println("Hersteller: " + manufacturer);
         */
        IO.println("Manufacturer: " + manufacturer);
        IO.println("Color: " + color);
        IO.println("Screen Size: " + screenSize + "\"");
        IO.println("CPU-core count: " + coreCount);
        IO.println("RAM: " + ram + " GB");
        IO.println("Storage: " + storage + " GB");
        IO.println("Fan: " + fan);
        IO.println("Retail price: " + retailPrice + ",-");
    }
}
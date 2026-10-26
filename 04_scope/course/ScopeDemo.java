package course;

/**
 * LIVE DEMO
 **/
public class ScopeDemo {

    int x = 42; // Instanzvariable "x"

    /**
     * Beispiel 1: Was wird ausgegeben (x=...)?
     */
    void example1() {
        IO.println(x);
        // auch wenn an dieser Stelle nur die Instanzvariable gemeint sein kann,
        // wäre es sauberer mit "this" auf sie zuzugreifen
        // IO.println(this.x);
    }

    /**
     * Beispiel 2: Was wird ausgegeben (x=...)?
     */
    void example2() {
        // Lokale Variable x trotz gleichnamiger Instanzvariable möglich
        int x = 1;
        IO.println(x);

        // Anmerkung: Auf Instanzvariable "x" kann weiterhin via "this" zugegriffen werden.
        // IO.println(this.x);
    }

    /**
     * Beispiel 3: Was wird ausgegeben (x=...)
     */
    void example3(int x) {
        IO.println(x);

        // Anmerkung: Bei einer Instanzvariable und einer lokalen Variable mit gleichem Namen
        // hat die lokale Variable Vorrang, die Instanzvariable muss in diesem Fall
        // über "this" referenziert werden.
    }

    /**
     * Beispiel 4: Was wird ausgegeben?
     */
    void example4(int zahl) {
        String nachricht = "Mir ist die Zahl egal.";
        if (zahl < 100) {
            //String nachricht = "Die Zahl war kleiner als 100!"; <- FEHLER! "Variable 'nachricht' is already defined in the scope"
            nachricht = "Die Zahl war kleiner als 100!";
        }
        IO.println(nachricht);
    }

    static void main() {
        ScopeDemo demo = new ScopeDemo();
        // Beispiele können auf 'demo' aufgerufen werden.

        //Beispiel 1
        demo.example1();
        //Beispiel 2
        demo.example2();
        //Beispiel 3
        demo.example3(5);
        //Beispiel 4
        demo.example4(5);
    }
}

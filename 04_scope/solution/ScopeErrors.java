package solution;

public class ScopeErrors {

    int zahl = 100;

    String variable = "Das hier soll ausgegeben werden!";

    /**
     * TODO Aufgabe 1:
     * a) Korrigiere die Methode, sodass die Variable 'message' ausgegeben wird
     * b) Gib mithilfe von Aufgabe 1a 'Die Zahl ist kleiner als 100' aus! --> main
     **/
    void task1(int zahl) {
        String message;
        if (zahl < 100) {
            message = "Die Zahl ist kleiner als 100!";
        } else {
            message = "Die Zahl ist größer gleich 100!";
        }

        IO.println(message);
    }

    /**
     * TODO Aufgabe 2:
     * Korrigiere die Methode, sodass die Instanzvariable 'variable' ausgegeben wird
     **/
    void task2() {
        String variable = "Das hier soll nicht ausgegeben werden!";
        IO.println(this.variable);
    }

    /**
     * TODO Aufgabe 3:
     * a) Lies dir die Methode durch. Was wird ausgegeben?
     * b) Setze geeignete Breakpoints und debugge die Methode, um deine Vermutung zu verifizieren!
     **/
    void task3() {

        int a = 10;
        int b = a + zahl;

        int zahl = 10;

        int ergebnis = b + zahl;

        IO.println(ergebnis); // Ausgabe: 120
    }

    static void main() {
        ScopeErrors scopeErrors = new ScopeErrors();
        scopeErrors.task1(50);
        scopeErrors.task2();
        scopeErrors.task3();
    }
}

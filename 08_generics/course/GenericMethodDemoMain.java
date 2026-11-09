package course;

public class GenericMethodDemoMain {
    static void main() {
        Integer[] inputIntegerArray = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        String[] inputStringArray = {"Hallo!", "Hello!", "¡Hola!", "Salut!"};

        GenericMethodDemo demo = new GenericMethodDemo();
        //TODO: Demo
        // Gib jeweils den ersten Eintrag der Arrays mit einer passenden Methode zurück
        int firstInteger = demo.getFirstElementFromIntArray(inputIntegerArray);
        String firstString = demo.getFirstElementFromStringArray(inputStringArray);

        IO.println(firstInteger);
        IO.println(firstString);

        //Müssen wir für jeden Datentyp eine eigene Methode implementieren? -> Nein
        //Lösung: Generics
        int firstIntegerGeneric = demo.getFirstElementFromArray(inputIntegerArray);
        String firstStringGeneric = demo.getFirstElementFromArray(inputStringArray);

        IO.println(firstIntegerGeneric);
        IO.println(firstStringGeneric);
    }
}

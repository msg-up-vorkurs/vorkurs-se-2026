package course;

import java.util.ArrayList;

public class GenericListAnalyserDemoMain {
    static void main() {
        ArrayList<Integer> inputIntegerList = new ArrayList<Integer>();
        inputIntegerList.add(8);
        inputIntegerList.add(13);
        inputIntegerList.add(21);
        inputIntegerList.add(34);

        ArrayList<String> inputStringList = new ArrayList<String>();
        inputStringList.add("Hallo!");
        inputStringList.add("Hello!");
        inputStringList.add("¡Hola!");
        inputStringList.add("Salut!");

        //TODO: Demo
        // Initialisiere für jedes Array ein GenericListAnalyserDemo-Objekt
        // und probiere die vorhandenen Methoden aus
        GenericListAnalyserDemo<Integer> genericIntegerListAnalyser = new GenericListAnalyserDemo<>(inputIntegerList);
        genericIntegerListAnalyser.printSize();
        genericIntegerListAnalyser.printFirstElement();
        genericIntegerListAnalyser.addElement(55);
        //genericIntegerListAnalyser.addElement("Ciao!"); //FEHLER!
        //Typ ist bereits festgelegt.

        GenericListAnalyserDemo<String> genericStringAnalyser = new GenericListAnalyserDemo<>(inputStringList);
        genericStringAnalyser.printSize();
        genericStringAnalyser.printFirstElement();
        genericStringAnalyser.addElement("Ciao!");
    }
}

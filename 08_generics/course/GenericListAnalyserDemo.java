package course;

import java.util.ArrayList;

public class GenericListAnalyserDemo<T> {

    private ArrayList<T> elements;

    public GenericListAnalyserDemo(ArrayList<T> elements) {
        this.elements = elements;
    }

    public void printSize() {
        IO.println("Die Liste enthält aktuell " + this.elements.size() + " Elemente");
    }

    public void printFirstElement() {
        IO.println("Der erste Eintrag der Liste ist: " + this.elements.getFirst());
    }

    public void addElement(T newElement) {
        this.elements.add(newElement);
        IO.println("Der Liste wurde das neue Element " + newElement + " hinzugefügt.");
        this.printSize();
    }
}

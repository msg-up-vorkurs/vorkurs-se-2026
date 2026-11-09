package course;

public class GenericMethodDemo {

    //TODO: Demo
    // Implementiere geeignete Methoden,
    // die den ersten Eintrag eines Arrays zurückgeben

    public int getFirstElementFromIntArray(Integer[] array) {
        return array[0];
    }

    public String getFirstElementFromStringArray(String[] array) {
        return array[0];
    }

    public <ElementType> ElementType getFirstElementFromArray(ElementType[] array) {
        return array[0];
    }
}

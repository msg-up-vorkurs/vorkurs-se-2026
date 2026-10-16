void main() {

    /*
     * Basis-Datentypen
     *
     * boolean: true or false
     * byte: 	-128 bis 127
     * short:	-32.768 bis 32.767
     * int:     -2.147.483.648 bis 2.147.483.647
     * long:    −9.223.372.036.854.775.808 bis 9.223.372.036.854.775.807
     * float:	32-bit Gleitkommazahl (ca. 7 Ziffern)
     * double:	64-bit Gleitkommazahl (ca. 15 Ziffern)
     * char:	Repräsentiert ein einzelnes 16-bit Unicode Zeichen
     * String:  Zeichenketten
     */

    /*
     * Deklaration einer Variable
     * [Datentyp] [Variablenname];
     * Variablennamen:
     *   sind case-sensitive (age, Age, aGe sind verschiedene Variablen)
     *   dürfen keine Leerzeichen enthalten
     *   dürfen keine Java Schlüsselwörter sein (z.B. boolean, byte, short, ..., final, public, static, ...)
     */

    boolean isNiceWeather;
    short age;
    long population;
    double price;
    String name;

    /*
     * Initialisierung / Wertzuweisungen
     * [Variablenname] = [Wert];
     */

    age = 26;
    population = 7868872451L;
    price = 3.99;
    name = "John";
    float temperature = 21.5F;
    char currency = '€';

    isNiceWeather = true;
    IO.println("Initial weather: " + isNiceWeather);
    isNiceWeather = false;
    IO.println("Weather after reassigning: " + isNiceWeather);

    IO.println("Age: " + age);
    IO.println("Population: " + population);
    IO.println("Price: " + price);
    IO.println("Name: " + name);
    IO.println("Temperature: " + temperature);
    IO.println("Currency: " + currency);

    /*
     * Arithmetische Operatoren
     * +, -, *, /, % (Modulo)
     */

    int sum = 1 + 1;
    IO.println("Sum: " + sum);
    int product = 5 * 5;
    IO.println("Product: " + product);

    double gradeMath = 2.5;
    double gradeGerman = 4.0;
    double gradeEnglish = 1.6;
    double gradeAverage = (gradeMath + gradeEnglish + gradeGerman) / 3;
    IO.println("My grade average: " + gradeAverage);

    int dayOfMonth = 21;
    IO.println("Today: " + dayOfMonth);
    dayOfMonth++;
    IO.println("Tomorrow: " + dayOfMonth);

    /*
     * String Konkatenation
     */

    String message = "Hello World!";
    String concatMessage = "Message: " + message;
    IO.println(concatMessage);

    String myName = "John " + "Doe";
    IO.println("My name is " + myName);
}


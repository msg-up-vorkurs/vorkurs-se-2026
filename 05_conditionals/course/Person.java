package course;

public class Person {

    String name;
    String surname;
    int age;
    float height;
    float weight;

    public Person(String name, String surname, int age, float height, float weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    void sayHelloTo(String somebody) {
        IO.println("Hello " + somebody + ", I am " + this.name + " " + this.surname);
    }

    void sayHello() {
        IO.println("Hello, my name is " + this.fullName() + " and I am " + this.age + " years old.");
    }

    String fullName() {
        return this.name + " " + this.surname;
    }

    void celebrateBirthday() {
        this.age = this.age + 1;
    }

    float calculateBMI() {
        return this.weight / (this.height * this.height);
    }

    float heightInInch() {
        return this.height * 39.3700787F;
    }

    void setWeight(float weight) {
        this.weight = weight;
    }

    void setHeight(float height) {
        this.height = height;
    }



    /*
     * Bedingte Verzweigungen
     * falls [Bedingung] dann
     *   [Anweisungen]
     * sonst
     *   [Anweisungen]
     *
     * if ([Bedingung]) {
     *   [Anweisungen]
     * } else if ([Bedingung]) {
     *   [Anweisungen]
     * } else {
     *   [Anweisungen]
     * }
     */

    /*
     * Logische Operatoren
     * NOT: !
     * AND: &
     * XOR: ^
     * OR:  |
     *
     * Relationale Operatoren
     * equal to: ==
     * not equal to: !=
     * greater than: >
     * less than: <
     * greater than or equal to: >=
     * less than or equal to: <=
     */

    public void interpretBMI() {
        float bmi = this.calculateBMI();

        if (bmi < 18.5F) {
            IO.println(bmi + " < 18.5: Untergewicht");
        } else if (bmi > 25.0F) {
            IO.println(bmi + " > 25: Übergewicht");
        } else {
            IO.println(bmi + " zwischen 18.5 und 25: Normalgewicht");
        }
    }

    void printIsOldEnoughToEnterFunFair(){
        float minimumHeight = 1.80F;

        if(this.age >= 18){
            IO.println(this.name + " ist alt genug für den Eintritt");
            if(this.height >= minimumHeight){
                IO.print(" und darf Fahrgeschäfte benutzen");
            } else {
                IO.println(" und darf keine Fahrgeschäfte benutzen");
            }
        } else {
            IO.println(this.name + " ist nicht alt genug für den Eintritt");
        }

    }


    static void main() {
        Person john = new Person("John", "Doe" , 26, 1.86f, 92.0f);
        Person alice = new Person("Alice", "Doe", 18, 1.65f, 50f);

        john.interpretBMI();

        john.printIsOldEnoughToEnterFunFair();

        alice.printIsOldEnoughToEnterFunFair();
    }
}

package course;

public class Person {

    String firstName;
    String lastName;
    int age;
    double height;
    double weight;

    public Person(String firstName, String lastName, int age, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    void sayHello() {
        IO.println("Hello, my name is " + this.fullName() + " and I am " + this.age + " years old.");
    }

    String fullName() {
        return this.firstName + " " + this.lastName;
    }

    void sayHelloTo(String somebody) {
        IO.println("Hello " + somebody + ", I am " + this.fullName());
    }

    void sayHelloTo(Person other) {
        IO.println("Hello " + other.fullName() + ", I am " + this.fullName());
    }

    double calculateBMI() {
        return this.weight / (this.height * this.height);
    }

    double heightInInch() {
        return this.height * 39.3700787;
    }

    void celebrateBirthday() {
        this.age = this.age + 1;
    }

    boolean isOlderThan(int years) {
        return this.age > years;
    }

    static void main() {

        Person bob = new Person("Bob", "Doe", 26, 1.78, 75.0);
        Person alice = new Person("Alice", "Doe", 28, 1.65, 55.0);

        /*
         * Methodenaufruf
         * [Objekt].[Methode]([Parameter, ...]);
         */

        bob.sayHello();
        IO.println(bob.fullName());

        alice.sayHelloTo("John");
        bob.sayHelloTo(alice);

        IO.println("BMI of Bob: " + bob.calculateBMI());
        IO.println("BMI of Alice: " + alice.calculateBMI());

        IO.println("Bob's height: " + bob.heightInInch() + " in");

        IO.println("Bob's age: " + bob.age);
        bob.celebrateBirthday();
        IO.println("Bob's age after birthday: " + bob.age);

        IO.println("Is Bob an adult?: " + bob.isOlderThan(18));

    }
}

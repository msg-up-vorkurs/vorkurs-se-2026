package task;

public class BankAccount {

    int accountNumber;
    double balance;
    double overdraftLimit;

    public BankAccount(int accountNumber, double balance, double overdraftLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    void printInfo() {
        IO.println("Accountnumber: " + this.accountNumber);
        IO.println("Balance: " + this.balance);
        IO.println("-----------------------");
    }

    void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    void transfer(double amount, BankAccount to) {
        this.withdraw(amount);
        to.deposit(amount);
    }

    /*
     * TODO Aufgabe 1: calculateWithdrawLimit
     * Für das Auszahlungslimit wird sowohl der Kontostand als auch das Kreditlimit berücksichtigt
     */
    double calculateWithdrawLimit() {
        // replace with your implementation
        return 0.0;
    }

    /*
     * TODO Aufgabe 2: transferChecked
     * Vor jeder Überweisung soll sichergestellt werden,
     * ob der Betrag unter Einhaltung des Kreditlimits abgebucht werden kann.
     */
    void transferChecked(double amount, BankAccount to) {
        // insert your implementation here
    }

    /*
     * TODO Aufgabe 3: Währungskonvertierung
     * Ein Bankkonto ist in mehreren Währungsregionen gültig. Um einen besseren Überblick über die Preise im Ausland
     * zu bekommen, soll der Kontostand in verschiedene ausländische Währungen umgerechnet werden können.
     * Die Währung des Kontos liegt derzeit in "Euro" vor.
     *
     * Implementieren Sie eine Methode `public double convertCurrency(String targetCurrency)`.
     * Diese Methode akzeptiert einen String, welcher die Zielwährung definiert.
     * Die folgenden Wechselkurse sollen unterstützt werden:
     *
     * |   Währung   |   Wechselkurs      |
     * |-------------|--------------------|
     * | USD         | 1 EUR = 1,05 USD   |
     * | NOK         | 1 EUR = 11,49 NOK  |
     * | LIRA        | 1 EUR = 29,17 LIRA |
     * | PESO        | 1 EUR = 19,24 PESO |
     *
     * Verwenden Sie für die Implementierung ein `switch`-Konstrukt. Bei Angabe einer nicht-aufgelisteten Währung soll
     * eine Fehlermeldung angezeigt werden. Die Funktion soll dann `-1` als Wert zurückgeben.
     *
     * Bonusaufgabe: Implementieren Sie die gleiche Funktion unter Verwendung einer switch-Expression.
     */
    public double convertCurrency(String targetCurrency){
        // insert your implementation here
        return 0.0;
    }

    static double getUserInputAsDouble() {
        return Double.parseDouble(IO.readln("Betrag: "));
    }

    static void main() {

        BankAccount aliceAccount = new BankAccount(1, 18000, 2000.0);
        BankAccount bobAccount = new BankAccount(2, 10000.0, 0.0);

        double amount = getUserInputAsDouble();

        aliceAccount.transferChecked(amount, bobAccount);
        aliceAccount.printInfo();

    }
}
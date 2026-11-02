package solution;

public class BankAccountTest {

    static int richtig = 0;
    static int falsch = 0;

    static void main() {

        // Aufgabe 2: Uncomment Tests after implementing transferChecked
        testCalculateWithdrawLimit();
        testTransferChecked();
        testTransferCheckedNoTransfer();

        IO.println("Bestandene Tests: " + richtig);
        IO.println("Fehlgeschlagene Tests: " + falsch);
    }


    static void testCalculateWithdrawLimit() {

        BankAccount aliceAccount = new BankAccount(1, 18000, 2000.0);
        BankAccount bobAccount = new BankAccount(2, 10000.0, 0.0);

        double aliceExpected = 20000.0;
        double aliceActual = aliceAccount.calculateWithdrawLimit();

        if (aliceExpected == aliceActual) richtig++;
        else {
            falsch++;
            IO.println("testCalculateWithdrawLimit()");
            IO.println("Alice's Withdraw Limit (IST): " + aliceActual);
            IO.println("Alice's Withdraw Limit (SOLL): " + aliceExpected + "\n");
        }
    }

    static void testTransferChecked() {

        BankAccount aliceAccount = new BankAccount(1, 18000, 2000.0);
        BankAccount bobAccount = new BankAccount(2, 10000.0, 0.0);

        aliceAccount.transferChecked(2000.0, bobAccount);

        double aliceExpected = 16000.0;
        double aliceActual = aliceAccount.balance;
        double bobExpected = 12000.0;
        double bobActual = bobAccount.balance;

        if (aliceExpected == aliceActual && bobExpected == bobActual) richtig++;
        else {
            falsch++;
            IO.println("testTransferChecked()");
            IO.println("Alice's Konto (IST): " + aliceActual);
            IO.println("Bob's Konto (IST): " + bobActual);
            IO.println("Alice's Konto (SOLL): " + aliceExpected);
            IO.println("Bob's Konto (SOLL): " + bobExpected + "\n");
        }
    }

    static void testTransferCheckedNoTransfer() {

        BankAccount aliceAccount = new BankAccount(1, 18000, 2000.0);
        BankAccount bobAccount = new BankAccount(2, 10000.0, 0.0);

        aliceAccount.transferChecked(21000.0, bobAccount);

        double aliceExpected = 18000.0;
        double aliceActual = aliceAccount.balance;
        double bobExpected = 10000.0;
        double bobActual = bobAccount.balance;

        if (aliceExpected == aliceActual && bobExpected == bobActual) richtig++;
        else {
            falsch++;
            IO.println("testTransferCheckedNoTransfer()");
            IO.println("Alice's Konto (IST): " + aliceActual);
            IO.println("Bob's Konto (IST): " + bobActual);
            IO.println("Alice's Konto (SOLL): " + 18000.0);
            IO.println("Bob's Konto (SOLL): " + 10000.0 + "\n");
        }
    }

}

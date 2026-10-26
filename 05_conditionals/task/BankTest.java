package task;

public class BankTest {

    static Bank bank = new Bank();

    static int richtig = 0;
    static int falsch = 0;

    static void main() {
        testRateCredit();
        testRateCreditResidenceNotDE();
        testRateCreditAgeUnder18();
        testRateCreditNoRegularIncome();
        testRateCreditCreditScoreUnder70();
        testRateCreditCreditScoreIs70();
        testRateCreditCreditAmountOver100000CreditScoreOver80();
        testRateCreditCreditAmountOver100000CreditScoreUnder80();

        // Nur für die Erweiterungsregel relevant!
        // testRateCreditAgeOver63SufficientCreditCollateral();
        // testRateCreditAgeOver63InsufficientCreditCollateral();

        IO.println("Bestandene Tests: " + richtig);
        IO.println("Fehlgeschlagene Tests: " + falsch);
    }

    static void testRateCredit() {
        boolean expectedRating = true;
        boolean actualRating = bank.rateCreditAdvanced('D', 35, true, 100, 60000, 0);

        if (actualRating == expectedRating)
            richtig++;
        else {
            falsch++;
            IO.println("testRateCredit():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditResidenceNotDE() {
        boolean expectedRating = false;
        boolean actualRating = bank.rateCreditAdvanced('A', 35, true, 100, 60000, 0);

        if (actualRating == expectedRating)
            richtig++;
        else {
            falsch++;
            IO.println("testRateCreditResidenceNotDE():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditAgeUnder18() {
        boolean expectedRating = false;
        boolean actualRating = bank.rateCreditAdvanced('D', 17, true, 100, 60000, 0);

        if (actualRating == expectedRating)
            richtig++;
        else {
            falsch++;
            IO.println("testRateCreditAgeUnder18():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditNoRegularIncome() {
        boolean expectedRating = false;
        boolean actualRating = bank.rateCreditAdvanced('D', 35, false, 100, 60000, 0);

        if (actualRating == expectedRating)
            richtig++;
        else {
            falsch++;
            IO.println("testRateCreditNoRegularIncome():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditCreditScoreUnder70() {
        boolean expectedRating = false;
        boolean actualRating = bank.rateCreditAdvanced('D', 35, true, 69, 60000, 0);

        if (actualRating == expectedRating)
            richtig++;
        else {
            falsch++;
            IO.println("testRateCreditCreditScoreUnder70():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditCreditScoreIs70() {
        boolean expectedRating = true;
        boolean actualRating = bank.rateCreditAdvanced('D', 35, true, 70, 60000, 0);

        if (actualRating == expectedRating)
            richtig++;
        else {
            falsch++;
            IO.println("testRateCreditCreditScoreIs70():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditCreditAmountOver100000CreditScoreOver80() {
        boolean expectedRating = true;
        boolean actualRating = bank.rateCreditAdvanced('D', 35, true, 80, 100001, 0);

        if (actualRating == expectedRating)
            richtig++;
        else {
            falsch++;
            IO.println("testRateCreditCreditAmountOver100000CreditScoreOver80():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditCreditAmountOver100000CreditScoreUnder80() {
        boolean expectedRating = false;
        boolean actualRating = bank.rateCreditAdvanced('D', 35, true, 79, 100001, 0);

        if (actualRating == expectedRating)
            richtig++;
        else {
            falsch++;
            IO.println("testRateCreditCreditAmountOver100000CreditScoreUnder80():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    // Nur für die Erweiterungsregel relevant!
    static void testRateCreditAgeOver63SufficientCreditCollateral() {
        boolean expectedRating = true;
        boolean actualRating = bank.rateCreditAdvanced('D', 64, true, 100, 100001, 100001);

        if (actualRating == expectedRating)
            richtig++;
        else {
            falsch++;
            IO.println("testRateCreditAgeOver63SufficientCreditCollateral():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditAgeOver63InsufficientCreditCollateral() {
        boolean expectedRating = false;
        boolean actualRating = bank.rateCreditAdvanced('D', 64, true, 100, 100001, 60000);

        if (actualRating == expectedRating)
            richtig++;
        else {
            falsch++;
            IO.println("testRateCreditAgeOver63InsufficientCreditCollateral():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }
}

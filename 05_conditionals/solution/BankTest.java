package solution;

public class BankTest {

    static Bank bank = new Bank();

    static int richtig = 0;
    static int falsch = 0;

    static void main() {
        testRateCredit();
        testRateCreditAgeUnder18();
        testRateCreditNoRegularIncome();
        testRateCreditCreditScoreUnder70();
        testRateCreditCreditScoreIs70();

        IO.println("Bestandene Tests: " + richtig);
        IO.println("Fehlgeschlagene Tests: " + falsch);

        //
        IO.println("Ende Aufgabe 4. Starte nun Tests für Aufgabe 5.");
        richtig = 0;
        falsch = 0;

        testRateCreditAdvanced();
        testRateCreditAdvancedResidenceNotDE();
        testRateCreditAdvancedAgeUnder18();
        testRateCreditAdvancedNoRegularIncome();
        testRateCreditAdvancedCreditScoreUnder70();
        testRateCreditAdvancedCreditScoreIs70();
        testRateCreditAdvancedCreditAmountOver100000CreditScoreOver80();
        testRateCreditAdvancedCreditAmountOver100000CreditScoreUnder80();

        // Nur für die Erweiterungsregel relevant!
        testRateCreditAdvancedAgeOver63SufficientCreditCollateral();
        testRateCreditAdvancedAgeOver63InsufficientCreditCollateral();

        IO.println("Bestandene Tests: " + richtig);
        IO.println("Fehlgeschlagene Tests: " + falsch);
    }


    static void testRateCredit() {
        boolean expectedRating = true;
        boolean actualRating = bank.rateCredit(35, true, 100);

        if (actualRating == expectedRating) richtig++;
        else {
            falsch++;
            IO.println("testRateCredit():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditAgeUnder18() {
        boolean expectedRating = false;
        boolean actualRating = bank.rateCredit(17, true, 100);

        if (actualRating == expectedRating) richtig++;
        else {
            falsch++;
            IO.println("testRateCreditAgeUnder18():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditNoRegularIncome() {
        boolean expectedRating = false;
        boolean actualRating = bank.rateCredit(35, false, 100);

        if (actualRating == expectedRating) richtig++;
        else {
            falsch++;
            IO.println("testRateCreditNoRegularIncome():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditCreditScoreUnder70() {
        boolean expectedRating = false;
        boolean actualRating = bank.rateCredit(35, true, 69);

        if (actualRating == expectedRating) richtig++;
        else {
            falsch++;
            IO.println("testRateCreditCreditScoreUnder70():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditCreditScoreIs70() {
        boolean expectedRating = true;
        boolean actualRating = bank.rateCredit(35, true, 70);

        if (actualRating == expectedRating) richtig++;
        else {
            falsch++;
            IO.println("testRateCreditCreditScoreIs70():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    // ab hier Tests für rateCreditAdvanced

    static void testRateCreditAdvanced() {
        boolean expectedRating = true;
        boolean actualRating = bank.rateCreditAdvanced('D', 35, true, 100, 60000, 0);

        if (actualRating == expectedRating) richtig++;
        else {
            falsch++;
            IO.println("testRateCreditAdvanced():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditAdvancedResidenceNotDE() {
        boolean expectedRating = false;
        boolean actualRating = bank.rateCreditAdvanced('A', 35, true, 100, 60000, 0);

        if (actualRating == expectedRating) richtig++;
        else {
            falsch++;
            IO.println("testRateCreditAdvancedResidenceNotDE():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditAdvancedAgeUnder18() {
        boolean expectedRating = false;
        boolean actualRating = bank.rateCreditAdvanced('D', 17, true, 100, 60000, 0);

        if (actualRating == expectedRating) richtig++;
        else {
            falsch++;
            IO.println("testRateCreditAdvancedAgeUnder18():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditAdvancedNoRegularIncome() {
        boolean expectedRating = false;
        boolean actualRating = bank.rateCreditAdvanced('D', 35, false, 100, 60000, 0);

        if (actualRating == expectedRating) richtig++;
        else {
            falsch++;
            IO.println("testRateCreditAdvancedNoRegularIncome():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditAdvancedCreditScoreUnder70() {
        boolean expectedRating = false;
        boolean actualRating = bank.rateCreditAdvanced('D', 35, true, 69, 60000, 0);

        if (actualRating == expectedRating) richtig++;
        else {
            falsch++;
            IO.println("testRateCreditAdvancedCreditScoreUnder70():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditAdvancedCreditScoreIs70() {
        boolean expectedRating = true;
        boolean actualRating = bank.rateCreditAdvanced('D', 35, true, 70, 60000, 0);

        if (actualRating == expectedRating) richtig++;
        else {
            falsch++;
            IO.println("testRateCreditAdvancedCreditScoreIs70():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditAdvancedCreditAmountOver100000CreditScoreOver80() {
        boolean expectedRating = true;
        boolean actualRating = bank.rateCreditAdvanced('D', 35, true, 80, 100001, 0);

        if (actualRating == expectedRating) richtig++;
        else {
            falsch++;
            IO.println("testRateCreditAdvancedCreditAmountOver100000CreditScoreOver80():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditAdvancedCreditAmountOver100000CreditScoreUnder80() {
        boolean expectedRating = false;
        boolean actualRating = bank.rateCreditAdvanced('D', 35, true, 79, 100001, 0);

        if (actualRating == expectedRating) richtig++;
        else {
            falsch++;
            IO.println("testRateCreditAdvancedCreditAmountOver100000CreditScoreUnder80():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    // Nur für die Erweiterungsregel relevant!
    static void testRateCreditAdvancedAgeOver63SufficientCreditCollateral() {
        boolean expectedRating = true;
        boolean actualRating = bank.rateCreditAdvanced('D', 64, true, 100, 100001, 100001);

        if (actualRating == expectedRating) richtig++;
        else {
            falsch++;
            IO.println("testRateCreditAdvancedAgeOver63SufficientCreditCollateral():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }

    static void testRateCreditAdvancedAgeOver63InsufficientCreditCollateral() {
        boolean expectedRating = false;
        boolean actualRating = bank.rateCreditAdvanced('D', 64, true, 100, 100001, 60000);

        if (actualRating == expectedRating) richtig++;
        else {
            falsch++;
            IO.println("testRateCreditAgeOver63InsufficientCreditCollateral():");
            IO.println("ERGEBNIS: " + actualRating);
            IO.println("ERWARTET: " + expectedRating + "\n");
        }
    }
}

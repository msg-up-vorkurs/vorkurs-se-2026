package course;

public class DayOfWeek {
    static void main() {

        int dayOfWeek = 1;

        if (dayOfWeek == 1) {
            IO.println("Monday");
        } else if (dayOfWeek == 2) {
            IO.println("Tuesday");
        } else if (dayOfWeek == 3) {
            IO.println("Wednesday");
        }

        /*
        / Switch-Case
        / switch([Ausdruck]) {
        /   case [x]:           // Beschreibt den Fall x == Ausdruck; x muss Literal/Konstante sein
        /       [Anweisungen für Fall x]
        /       break;          // Beendet das Ausführen der Anweisungen
        /   case [y]:
        /       [Anweisungen für Fall y]
        /   case [z]:
        /       [Anweisungen für Fall z]
        /       break;
        /   default:             // Wenn kein anderer Fall zutrifft, kann damit eine Standardanweisung ausgeführt werden.
        /       [Anweisungen, wenn kein Fall zutrifft]
        / }
        /
        / Für den Fall y werden aufgrund des fehlenden 'break' sowohl die [Anweisungen für Fall y]
        / und die [Anweisungen für Fall z] ausgeführt
         */

        switch (dayOfWeek) {
            case 1:
                IO.println("Monday");
                break;
            case 2:
                IO.println("Tuesday");
                break;
            case 3:
                IO.println("Wednesday");
                break;
            case 4:
                IO.println("Thursday");
                break;
            case 5:
                IO.println("Friday");
                break;
            case 6:
            case 7:
                IO.println("Wochenende");
                break;
            default:
                IO.println("Day of Week must be in the range 1-7.");
        }

        /*
         * Switch-Expressions
         */
        String dayOfWeekExpression = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> "Wochenende";
            default -> "Day of Week must be in the range 1-7.";
        };

        IO.println(dayOfWeekExpression);
    }
}

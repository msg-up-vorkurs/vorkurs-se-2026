void main() {

    /* if (<Bedingung>) {
     * <Anweisungen, wenn Bedingung wahr>
     * } else if (<Andere Bedingung>){                          -> optional
     * <Anweisungen, wenn andere Bedingung wahr>
     * } else {                                                 -> optional
     * <Anweisungen, wenn alle vorherigen Bedingungen falsch>
     * }
     */

    boolean isWeatherNice = false;
    boolean isWeatherHot = true;

    if (isWeatherNice) {
        IO.println("Das Wetter ist schön!");
        if (isWeatherHot) {
            IO.println("Sonnencreme mitnehmen!");
        }
    } else {
        IO.println("Regenschirm mitnehmen!");
    }

    int number = 5;

    if (number < 10 && number > 2) {
        IO.println("Nummer ist kleiner als 10 und größer als 2");
    }

    if (number < 10 || number > 2) {
        IO.println("Nummer ist kleiner als 10 oder größer als 2");
    }

}

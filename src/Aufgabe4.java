public class Aufgabe4 {
    public static void main(String[] args) {
        float startkapital = 500f, zinssatz = 5, kapital = startkapital, zinsen;
        int tage = 360;
        zinsen = (kapital * zinssatz * tage) / (100 * 360);
        kapital = kapital + zinsen;
        System.out.println("Startkapital " + startkapital + "€" +
                " Nach " + tage + " tagen: " + kapital + "€" + " Zinsen: " + zinsen + "%");
    }
}

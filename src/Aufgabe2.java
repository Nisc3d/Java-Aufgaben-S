public class Aufgabe2 {
    public static void main(String[] args) {
        int n = 288, n_stueck, n_gros, n_schock, n_dutzend;
        n_stueck = n;
        n_gros = n_stueck / 144;
        n_stueck = n_stueck % 144;
        n_schock = n_stueck / 60;
        n_stueck = n_stueck % 60;
        n_dutzend = n / 12;
        n_stueck = n_stueck % 12;
        System.out.println("Anfangszahl n: " + n + " Gros: " + n_gros + " Schock: " + n_schock + " Dutzend: "
                + n_dutzend + " Stück: " + n_stueck);
    }
}

import java.awt.*;

public class Aufgabe8 {
    public static void main(String[] args) {
        double zufallszahl, zufallszahl2;
        int punkte = 0, maexchenzahlint;
        String maexchenzahl;

        //Generierung der Zufallszahlen
        zufallszahl = (Math.random() * 6) + 1;
        zufallszahl = (int) zufallszahl;
        zufallszahl2 = (Math.random() * 6) + 1;
        zufallszahl2 = (int) zufallszahl2;

        //Abfrage ob Zufallszahl 12 oder 21, wenn ja dann plus 1000 Punkte
        if (zufallszahl == 1 && zufallszahl2 == 2) {
            punkte += 1000;
        }
        else if (zufallszahl == 2 && zufallszahl2 == 1) {
            punkte += 1000;
        }

        //Fallentscheidung damit größere Zahl vorne stehen kann
        if (zufallszahl > zufallszahl2) {

            //maexchenzahl zum String kovertieren und .0 entfernen
            maexchenzahl = String.valueOf(zufallszahl) + String.valueOf(zufallszahl2);
            maexchenzahl = maexchenzahl.replaceAll(".0", "");
        }
        else {

            //maexchenzahl zum String kovertieren und .0 entfernen
            maexchenzahl = String.valueOf(zufallszahl2) + String.valueOf(zufallszahl);
            maexchenzahl = maexchenzahl.replaceAll(".0", "");
            //Extrapunkte wenn es ein Pasch ist, dafür muss maexchenzahlint eine integer sein
            if (zufallszahl == zufallszahl2) {
                maexchenzahlint = Integer.valueOf(maexchenzahl);
                punkte = punkte + (maexchenzahlint * 100);
            }
        }

        //Ausgabe der Ergebnisse
        System.out.println("Ergebnis Zahl: " + maexchenzahl);
        System.out.println("Punkte: " + punkte);

    }
}
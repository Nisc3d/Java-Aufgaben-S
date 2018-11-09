import java.util.Scanner;

public class Aufgabe16 {
    public static void main(String[] args) {
        int tag, monat, ergebnis = 0;
        int jan = 31, feb = 28, mae = 31, apr = 30, mai = 31, jun = 30, jul = 31, aug = 31, sep = 30, okt = 31, nov = 30, dez = 31;

        Scanner In = new Scanner(System.in);

        System.out.println("Bitte Eingabe Tag: ");
        tag = In.nextInt();

        System.out.println("Bitte Eingabe Monat: ");
        monat = In.nextInt();

        if (monat == 1) {
            ergebnis = tag;
        }
        else if (monat == 2) {
            ergebnis = jan + tag;
        }
        else if (monat == 3) {
            ergebnis = jan + feb + tag;
        }
        else if (monat == 4) {
            ergebnis = jan + feb + mae + tag;
        }
        else if (monat == 5) {
            ergebnis = jan + feb + mae + apr + tag;
        }
        else if (monat == 6) {
            ergebnis = jan + feb + mae + apr + mai + tag;
        }
        else if (monat == 7) {
            ergebnis = jan + feb + mae + apr + mai + jun + tag;
        }
        else if (monat == 8) {
            ergebnis = jan + feb + mae + apr + mai + jun + jul + tag;
        }
        else if (monat == 9) {
            ergebnis = jan + feb + mae + apr + mai + jun + jul + aug + tag;
        }
        else if (monat == 10) {
            ergebnis = jan + feb + mae + apr + mai + jun + jul + aug + sep + tag;
        }
        else if (monat == 11) {
            ergebnis = jan + feb + mae + apr + mai + jun + jul + aug + sep + okt + tag;
        }
        else if (monat == 12) {
            ergebnis = jan + feb + mae + apr + mai + jun + jul + aug + sep + okt + nov + tag;
        }

        System.out.println("Ergebnis: " + ergebnis);
    }
}

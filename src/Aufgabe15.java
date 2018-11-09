import java.util.Scanner;

public class Aufgabe15 {
    public static void main(String[] args) {
        double kredithoehe = 0, rate = 0, darlehensstand = kredithoehe;
        int zinssatz = 0, laufzeit = 0, zaehler = 1, zinsen;

        Scanner In = new Scanner(System.in);

        System.out.println("Eingabe Kredithöhe (in €):");
        kredithoehe = In.nextDouble();

        System.out.println("Eingabe monatliche Rate (in €):");
        rate = In.nextDouble();

        System.out.println("Eingabe Zinssatz (in %):");
        zinssatz = In.nextInt();

        System.out.println("Eingabe Laufzeit (in Jahren):");
        laufzeit = In.nextInt();

//        while (zaehler <= laufzeit) {
//            zinsen = darlehensstand * 1.0
//            darlehensstand =
//
//        }

    }
}

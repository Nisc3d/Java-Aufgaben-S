import java.util.Scanner;

public class Aufgabe17 {
    public static void main(String[] args) {
        int  w1 = 1, w2 = 1, w3 = 1, w4 = 1, kombinationen = 0;
        Scanner In = new Scanner(System.in);
        System.out.println("Bitte Eingabe Augensumme:");
        int augensumme = In.nextInt();

        while (w1 <= 6) {
            while (w2 <= 6) {
                while (w3 <= 6) {
                    while (w4 <= 6) {
                        if (w1 + w2 + w3 + w4 == augensumme) {
                            kombinationen += 1;
                        }
                        w4 += 1;
                    }
                    w4 = 1;
                    w3 += 1;
                }
                w4 = 1;
                w3 = 1;
                w2 += 1;
            }
            w4 = 1;
            w3 = 1;
            w2 = 1;
            w1 += 1;
        }

        System.out.println(kombinationen + " Kombinationen bei Augensumme " + augensumme);

    }
}

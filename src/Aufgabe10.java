public class Aufgabe10 {
    public static void main(String[] args) {
        int zahl = 1, zahlplus7 = 8, zeile = 1;
            while (zeile <= 8) {
                while (zahl <= zahlplus7) {
                    System.out.printf("%3d", zahl);
                    zahl += 1;
                }

                System.out.println("");
                zeile += 1;
                zahl = zeile;
                zahlplus7 += 1;
            }
        }
    }

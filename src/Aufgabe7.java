public class Aufgabe7 {
    public static void main(String[] args) {
        double zufallszahl;
        int eins = 0, zwei = 0, drei = 0, vier = 0, fuenf = 0, sechs = 0;
        int wuerfelvorgang = 1, x, zaehler = 1;
        while (wuerfelvorgang <= 1000) {
            zufallszahl = (Math.random() * 6) + 1;
            if ((int) zufallszahl == 1) {
                eins += 1;
            }
            else if ((int) zufallszahl == 2) {
                zwei += 1;
            }
            else if ((int) zufallszahl == 3) {
                drei += 1;
            }
            else if ((int) zufallszahl == 4) {
                vier += 1;
            }
            else if ((int) zufallszahl == 5) {
                fuenf += 1;
            }
            else if ((int) zufallszahl == 6) {
                sechs += 1;
            }


            wuerfelvorgang += 1;
        }

        x = eins / 10;
        System.out.print(" 1| ");
        for (int i = 1; i <= x; i += 1) {
            System.out.print("x");
        }

        x = zwei / 10;
        System.out.println("");
        System.out.print(" 2| ");
        for (int i = 1; i <= x; i += 1) {
            System.out.print("x");
        }

        x = drei / 10;
        System.out.println("");
        System.out.print(" 3| ");
        for (int i = 1; i <= x; i += 1) {
            System.out.print("x");
        }

        x = vier / 10;
        System.out.println("");
        System.out.print(" 4| ");
        for (int i = 1; i <= x; i += 1) {
            System.out.print("x");
        }

        x = fuenf / 10;
        System.out.println("");
        System.out.print(" 5| ");
        for (int i = 1; i <= x; i += 1) {
            System.out.print("x");
        }

        x = sechs / 10;
        System.out.println("");
        System.out.print(" 6| ");
        for (int i = 1; i <= x; i += 1) {
            System.out.print("x");
        }
    }
}

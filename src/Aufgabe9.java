public class Aufgabe9 {
    public static void main(String[] args) {
        int nummer = 10, zeilenzaehler = 0, nummer1 = 0, nummer2 = 0, nummer3 = 0;
        boolean geloescht = false;
        String nummerstring, nummerstring1, nummerstring2, nummerstring3;
        while (nummer <= 999) {
            nummerstring = String.valueOf(nummer);
            nummerstring1 = nummerstring.substring(0, 1);
            nummer1 = Integer.valueOf(nummerstring1);
            nummerstring2 = nummerstring.substring(1, 2);
            nummer2 = Integer.valueOf(nummerstring2);
            if (nummer >= 100) {
                nummerstring3 = nummerstring.substring(2, 3);
                nummer3 = Integer.valueOf(nummerstring3);

            }


            if (nummer1 == nummer2) {
                geloescht = true;
            }
            if (nummer1 == nummer3 && geloescht == false) {
                geloescht = true;
            }
            if (nummer2 == nummer3 && geloescht == false) {
                geloescht = true;
            }


            if (geloescht == false) {
                if (zeilenzaehler == 8) {
                    System.out.println("");
                    zeilenzaehler = 0;
                }

                if (nummer >= 10 && nummer <= 99) {

                    System.out.print(" 0" + nummer);
                    zeilenzaehler += 1;
                }

                if (nummer >= 100) {
                    System.out.print(" " + nummer);
                    zeilenzaehler += 1;

                }

            }
            geloescht = false;
            nummer += 1;

        }
    }
}
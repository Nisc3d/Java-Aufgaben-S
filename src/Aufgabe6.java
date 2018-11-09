public class Aufgabe6 {
    public static void main(String[] args) {
        int zeile = 1;
        while (zeile <= 10) {
            //führt den System.out.print() Befehl so oft aus, wie gerade die jeweilige zeilennummer ist
            for (int i = 1; i <= zeile; i += 1) {
                System.out.print("*");
            }
            zeile += 1;
            System.out.println("");

        }
    }
}


        /*andere Möglichkeit:
        for (int i =1; i<=10; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");}
                    System.out.println();}
            }
        }*/
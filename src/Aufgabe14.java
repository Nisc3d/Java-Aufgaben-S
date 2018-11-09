public class Aufgabe14 {
    public static void main(String[] args) {
//gibt Schaltjahre von 0 bis 2400 n.Chr. aus.
//        int jahr = 0;
//        boolean schaltjahr = false;
//        while (jahr <= 2401) {
//            if (jahr % 4 == 0) {
//                schaltjahr = true;
//                if (jahr % 100 == 0 && jahr % 400 != 0) {
//                    schaltjahr = false;
//                }
//
//            }
//            if (schaltjahr == true) {
//                System.out.print(" " + jahr);
//            }
//            jahr += 1;
//            schaltjahr = false;
//        }

//gibt aus, ob Jahr Schaltjahr ist für vorgegebenes Jahr.
        int jahr = 2000;
        boolean schaltjahr = false;
        if (jahr % 4 == 0) {
            schaltjahr = true;
            if (jahr % 100 == 0 && jahr % 400 != 0) {
                schaltjahr = false;
            }
        }
        if (schaltjahr == true) {
            System.out.print("Jahr " + jahr + " ist ein Schaltjahr.");
        }
    }
}
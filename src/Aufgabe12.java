public class Aufgabe12 {
    public static void main(String[] args) {
        int sekunden = 31536001;
        double minuten = 0, stunden = 0, tage = 0, jahre = 0;

//        minuten = (double)sekunden / 60;
//        stunden = minuten / 60;
//        tage = stunden / 24;
//        jahre = tage / 365;


        minuten = (double) sekunden / 60;
        sekunden = sekunden % 60;

        stunden = minuten / 60;
        minuten = minuten % 60;

        tage = stunden / 24;
        stunden = stunden % 24;

        jahre = tage / 365;
        tage = tage % 365;




        System.out.printf("%d Sekunden entsprechen:\n%f Jahre\n%f Tage\n%f Stunden\n%f Minuten", sekunden, jahre, tage, stunden, minuten);
    }
}

public class Aufgabe11 {
    public static void main(String[] args) {
        int zahl = 111, einserziffer = 0, zehnerziffer = 0, hunderterziffer = 0;
        einserziffer = zahl % 10;
        zehnerziffer = (zahl % 100) / 10;
        hunderterziffer = zahl / 100;

        if (zahl % einserziffer == 0 && einserziffer != 0) {
            System.out.println("Zahl durch einserziffer " +  einserziffer + " teilbar.");
        }
        if (zahl % zehnerziffer == 0 && zehnerziffer != 0) {
            System.out.println("Zahl durch zehnerziffer " +  zehnerziffer + " teilbar.");
        }
        if (zahl % hunderterziffer == 0 && zehnerziffer != 0) {
            System.out.println("Zahl durch hunderterziffer " +  hunderterziffer + " teilbar.");
        }
    }
}

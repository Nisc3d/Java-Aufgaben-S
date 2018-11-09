import java.util.Scanner;

public class Aufgabe18_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Gesamthöhe eingeben: ");
        int gesamth = sc.nextInt();
        System.out.println("Stammhöhe eingeben: ");
        int stammh = sc.nextInt();

        Aufgabe18 Baum = new Aufgabe18(gesamth, stammh);
        Baum.ausgeben();
    }
}

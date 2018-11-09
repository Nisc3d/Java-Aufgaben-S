//Aufgabe19_2
//Test

public class Aufgabe19_2 {
    public static void main(String[] args) {
        Aufgabe19 Person1 = new Aufgabe19(123, 10000, "müller");
        Aufgabe19 Person2 = new Aufgabe19(124, 10001, "meier");
        Aufgabe19 Person3 = new Aufgabe19(125, 10002, "schmidt");
        Person1.anzeigen();
        Person2.anzeigen();
        Person3.anzeigen();
        Person1.gehalt_erhoehen(1);
        Person2.gehalt_erhoehen(2);
        Person1.anzeigen();
        Person2.anzeigen();
    }
}

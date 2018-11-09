public class Aufgabe13_2 {
    public static void main(String[] args) {
        Aufgabe13 Auto = new Aufgabe13("Golf", 120, 20, 4, false);
        System.out.println("Auto ausleihbar: " +  Auto.ausleihbar());
        Auto.ausleihen();
        System.out.println("Auto ausleihbar: " +  Auto.ausleihbar());
        Auto.anzeigen();

    }
}

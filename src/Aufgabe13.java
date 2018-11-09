public class Aufgabe13 {

    String auto_typ;
    int hoechstgesch, ps, sitzplaetze;
    boolean entliehen = false;
    boolean ausleihbar = true;

    Aufgabe13(String auto_typ, int hoechstgesch, int ps, int sitzplaetze, boolean entliehen) {
        this.auto_typ = auto_typ;
        this.hoechstgesch = hoechstgesch;
        this.ps = ps;
        this.sitzplaetze = sitzplaetze;
        this.entliehen = entliehen;
    }

    void anzeigen() {
        System.out.println("Auto Typ: " + auto_typ);
        System.out.println("Höchstegschwindigkeit: " + hoechstgesch);
        System.out.println("PS: " + ps);
        System.out.println("Sitzplätze: " + sitzplaetze);
        if (entliehen == true) {
            System.out.println("Status: entliehen");
        }
        else {
            System.out.println("Status: vorhanden");
        }
    }

    void ausleihen() {
        this.entliehen = true;
    }

    boolean ausleihbar() {
        if (entliehen == true) {
            return ausleihbar = false;
        }
        else {
            return ausleihbar = true;
        }
    }


}

//Aufgabe19

public class Aufgabe19 {
    int personalnummer, gehalt;
    String nachname;

    Aufgabe19(int personalnummer, int gehalt, String nachname) {
        this.personalnummer = personalnummer;
        this.gehalt = gehalt;
        this.nachname = nachname;
    }

    int get_personalnummer() {
        return personalnummer;
    }

    int get_gehalt() {
        return gehalt;
    }

    String get_nachname() {
        return nachname;
    }

    void set_personalnummer(int personalnummer) {
        this.personalnummer = personalnummer;
    }

    void set_gehalt(int gehalt) {
        this.gehalt = gehalt;
    }

    void set_nachname(String nachname) {
        this.nachname = nachname;
    }

    void gehalt_erhoehen(int gehaltserhoehung) {
        gehalt += gehaltserhoehung;
    }

    void anzeigen() {
        System.out.println("Nachname: " + nachname);
        System.out.println("Personalnummer: " + personalnummer);
        System.out.println("Gehalt in Cent: " + gehalt);
    }

}

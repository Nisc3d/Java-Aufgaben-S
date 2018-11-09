public class Aufgabe18 {
    int gesamth, stammh, kopfh, i = 1, j = 1, k = 0, schlussbreite = 0,  leerz = 0, n = 0;

    /*
    Laufvariablen:
    i ist die aktuelle Zeile
    j ist das aktuelle *
    i + k ist die aktuelle Anzahl an * in dieser Zeile --> k addiert immer 2 auf i
    n ist das aktuelle Leerzeichen
    */

    Aufgabe18(int gesamth, int stammh) {
        this.gesamth = gesamth;
        this.stammh = stammh;
        kopfh = this.gesamth - this.stammh;
    }

    void ausgeben() {
//      Schlussbreite (Breite der letzten Zeile) ermitteln
        while (i <= kopfh) {
            while (j <= i + k) {
                schlussbreite = i + k;
                j += 1;
            }
            j = 1;
            k += 1;
            i += 1;
        }

//      Variablen zurücksetzen
        i = 1;
        j = 1;
        k = 0;

//      Leerzeichen für erstes * ermitteln
        leerz = schlussbreite / 2;

//      Kopf zeichnen
        //Zeile für Zeile durchgehen
        while (i <= kopfh) {
            //Print der Zeile
            while (j <= i + k) {
                //Leerzeichen print am Anfang von Zeile
                while (n <= leerz) {
                    System.out.print(" ");
                    n += 1;
                }
                //* zeichnen
                System.out.print("*");
                j += 1;
            }
            System.out.println(" "); //neue Zeile beginnt jetzt
            leerz -= 1;
            j = 1;
            n = 0;
            k += 1;
            i += 1;
        }

//      Variablen zurücksetzen
        i = 1;
        j = 1;
        k = 0;
        n = 0;
        leerz = schlussbreite / 2;

//      Stamm zeichnen
        //Print der Zeile
        while (i <= stammh) {
            //Leerzeichen zeichnen
            while (n <= leerz){
                System.out.print(" ");
                n += 1;
            }
            //* zeichnen
            System.out.print("*");
            System.out.println(" "); //neue Zeile beginnt jetzt
            n = 0;
            i += 1;
        }

    }
}
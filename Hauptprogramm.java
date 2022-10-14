import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.*;

public class Hauptprogramm {
    public static void main(String[] args) {
        GregorianCalendar datAnna = new GregorianCalendar(1999, Calendar.JULY, 18);
        GregorianCalendar datBerta = new GregorianCalendar(1879, Calendar.FEBRUARY, 1);
        GregorianCalendar datCarl = new GregorianCalendar(1976, Calendar.DECEMBER, 24);
        Person anna = new Person("Allan","Anna", datAnna, "Unistrasse", 22, 4328, "Lauterbrunnen");
        Person berta = new Person("Bogart","Berta",datBerta, "Kehlbogen", 9, 9387, "Signau");
        Person carl = new Person("Kurzen","Carl",datCarl, "Musterstrasse", 10, 9999, "Musterswil");

        int count = 0;
        Person [] adressbuch = new Person [30];
        adressbuch[count++] = anna;
        adressbuch[count++] = berta;
        adressbuch[count++] = carl;


        try {
            // Neuer Teil
            String filename = "personen.txt";
            File file = new File(filename);
            long lenght = file.length();
            FileReader f = new FileReader(filename, StandardCharsets.UTF_8);
            char [] c = new char[(int)lenght];


            /* Alt
            FileReader f = new FileReader(filename);
            char [] c = new char[1300];
             */


            f.read(c);
            String s = new String(c);
            String [] result = s.split(";|\\.|\n");
            for (int i = 0; i < result.length - 1; i = i + 9) {
                GregorianCalendar tempDate = new GregorianCalendar(Integer.parseInt(result[i+8]),
                        Integer.parseInt(result[i+7])-1, Integer.parseInt(result[i+6]));
                Person temp = new Person(result[i], result[i+1], tempDate, result[i+2], Integer.parseInt(result[i+3]),
                        Integer.parseInt(result[i+4]), result[i+5]);
                adressbuch[count++] = temp;
            }
        } catch (IOException e) {
            System.err.println("Fehler beim Einlesen der Datei");
            System.err.println(e.getMessage());
        }
        for (int i = 0; i < count; i++) {
            adressbuch[i].print();
        }
    }
}

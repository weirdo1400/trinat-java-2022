import java.util.Calendar;
import java.util.GregorianCalendar;

public class PersonTest {
    public static void main(String[] args) {
        String name = "Max";
        String vorname = "Muster";
        GregorianCalendar gebdat = new GregorianCalendar(2000, Calendar.JANUARY, 1);
        String strasse = "Bahnhofstrasse";
        int hausnr = 99;
        int plz = 2189;
        String wohnort = "Theöretisch";

        Person person = new Person(name, vorname, gebdat, strasse, hausnr, plz, wohnort);
        System.out.println(person.getWohnort());
    }
}

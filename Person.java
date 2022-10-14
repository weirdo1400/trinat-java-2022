import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Person {
    private String name;
    private String vorname;
    private GregorianCalendar gebdat;
    private String strasse;
    private int hausnr;
    private int plz;
    private String wohnort;



    public Person(String n, String v, GregorianCalendar g, String str, int hn, int p, String w) {
        name = n;
        vorname = v;
        gebdat = g;
        strasse = str;
        hausnr = hn;
        plz = p;
        wohnort = w;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public GregorianCalendar getGebdat() {
        return gebdat;
    }

    public void setGebdat(GregorianCalendar gd) {
        this.gebdat = gd;
    }
    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getHausnr() {
        return hausnr;
    }

    public void setHausnr(int hausnr) {
        this.hausnr = hausnr;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getWohnort() {
        return wohnort;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    public int alter() {
        GregorianCalendar heute = new GregorianCalendar();
        int alter = heute.get(Calendar.YEAR) - gebdat.get(Calendar.YEAR);
        if(heute.get(Calendar.DAY_OF_YEAR) < gebdat.get(Calendar.DAY_OF_YEAR)) {
            alter--;
        }
        return alter;
    }

    public void print() {
        SimpleDateFormat df = new SimpleDateFormat("dd. MMMMM yyyy");
        String gebDat = df.format(gebdat.getTime());
        System.out.println(vorname + " " + name + "\n" + strasse + " " + hausnr +  "\n" + plz + " " + wohnort +
                "\n" + gebDat + "\n" + alter() + " Jahre alt." + "\n");

    }
}

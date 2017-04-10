package datatypes;

/**
 * Created by Hannes on 10.04.2017.
 */

public class user {

    private String vorname;
    private String nachname;

    public user(String vorname, String nachname){
        this.nachname = nachname;
        this.vorname = vorname;
    }
    public String getVorname() {
        return vorname;
    }
    public String getNachname() {
        return nachname;
    }
}

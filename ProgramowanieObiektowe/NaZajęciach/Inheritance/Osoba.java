package Inheritance;

public class Osoba {
    public String fullName;
    Adres adres;

    public Osoba(String fullName, Adres adres) {
        this.fullName = fullName;
        this.adres = adres;
    }

    public void view() {
        System.out.println("Osoba: " + fullName);
        adres.viewAdres();
    }
}
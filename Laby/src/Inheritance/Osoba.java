package Inheritance;

public class Osoba {
    private String fullName;
    Adres adres;

    public void view(){
        System.out.println("Osoba: "+fullName);
        adres.viewAdres();
    }
};
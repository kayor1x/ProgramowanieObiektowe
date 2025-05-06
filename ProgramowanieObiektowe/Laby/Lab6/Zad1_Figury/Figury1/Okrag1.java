package Figury1;

public class Okrag1 extends Figura{
    Punkt1 srodek;
    double promien;

    public Okrag1(){
        super();
        this.srodek = new Punkt1();
        this.promien = 0;
    }

    public Okrag1(Punkt1 srodek, double promien, String kolor) {
        super(kolor);
        this.srodek = srodek;
        this.promien = promien;
    }

    public double getPowierzchnia() { return Math.PI*promien*promien; }
    public double getSrednica() {return promien*2;}
    public void setPromien(double promien) {this.promien = promien;}
    public double getPromien(){return promien;}
    public boolean wSrodku(Punkt1 p) {
        if((Math.pow((p.getX()-srodek.getX()),2)+(Math.pow((p.getY()-srodek.getY()),2)) <= promien*promien))
            return true;
        else
            return false;
    }
    public String opis(){return "Klasa Okrag1. Kolor " + kolor;}
}

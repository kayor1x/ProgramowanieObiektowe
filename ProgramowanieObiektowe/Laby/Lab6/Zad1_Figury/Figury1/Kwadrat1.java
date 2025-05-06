package Figury1;

public class Kwadrat1 extends Prostokat1 {
    double bok;

    public Kwadrat1(float wys) {
        super(wys, wys);
        bok = wys;
    }

    public double getBok(){return bok;}
    public void setBok(double bok){
        this.wys = bok;
        this.szer = bok;
        this.bok = bok;
    }
    public String opis(){return "Klasa Kwadrat1. Kolor obiektu: "+kolor;}
}

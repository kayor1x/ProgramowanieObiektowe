package Figury;

public class Stozek {
    double promien, wysokosc;

    public Stozek(double promien, double wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
    }

    double obliczPole() {
        double l = Math.sqrt(promien * promien + wysokosc * wysokosc);
        return Math.PI * promien * (promien + l);
    }

    double obliczObjetosc() {
        return (1.0 / 3.0) * Math.PI * promien * promien * wysokosc;
    }

    public void viewData() {
        System.out.println("Stożek - Promień: " + promien + ", Wysokość: " + wysokosc + ", Pole: " + obliczPole() + ", Objętość: " + obliczObjetosc());
    }
}

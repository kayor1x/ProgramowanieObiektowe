package Figury;

public class Kolo {
    double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    double obliczPole() {
        return Math.PI * promien * promien;
    }

    double obliczObwod() {
        return 2 * Math.PI * promien;
    }

    public void viewData() {
        System.out.println("Koło - Promień: " + promien + ", Pole: " + obliczPole() + ", Obwód: " + obliczObwod());
    }
}

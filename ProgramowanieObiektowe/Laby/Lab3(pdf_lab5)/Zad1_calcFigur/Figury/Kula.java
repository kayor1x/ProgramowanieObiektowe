package Figury;

public class Kula {
    double promien;

    public Kula(double promien) {
        this.promien = promien;
    }

    double obliczPole() {
        return 4 * Math.PI * promien * promien;
    }

    double obliczObjetosc() {
        return (4.0 / 3.0) * Math.PI * Math.pow(promien, 3);
    }

    public void viewData() {
        System.out.println("Kula - Promień: " + promien + ", Pole: " + obliczPole() + ", Objętość: " + obliczObjetosc());
    }
}

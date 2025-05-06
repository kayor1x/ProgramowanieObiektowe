package Figury;

public class Prostokat {
    double dlugosc, szerokosc;

    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    double obliczPole() {
        return dlugosc * szerokosc;
    }

    double obliczObwod() {
        return 2 * (dlugosc + szerokosc);
    }

    public void viewData() {
        System.out.println("Prostokąt - Długość: " + dlugosc + ", Szerokość: " + szerokosc + ", Pole: " + obliczPole() + ", Obwód: " + obliczObwod());
    }
}

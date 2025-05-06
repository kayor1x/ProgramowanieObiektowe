package Figury;

public class Prostopadloscian {
    double dlugosc, szerokosc, wysokosc;

    public Prostopadloscian(double dlugosc, double szerokosc, double wysokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    double obliczPole() {
        return 2 * (dlugosc * szerokosc + dlugosc * wysokosc + szerokosc * wysokosc);
    }

    double obliczObjetosc() {
        return dlugosc * szerokosc * wysokosc;
    }

    public void viewData() {
        System.out.println("Prostopadłościan - Długość: " + dlugosc + ", Szerokość: " + szerokosc + ", Wysokość: " + wysokosc + ", Pole: " + obliczPole() + ", Objętość: " + obliczObjetosc());
    }
}

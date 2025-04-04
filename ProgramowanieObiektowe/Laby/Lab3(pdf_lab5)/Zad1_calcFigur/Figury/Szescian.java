package Figury;

public class Szescian {
    double bok;

    public Szescian(double bok) {
        this.bok = bok;
    }

    double obliczPole() {
        return 6 * bok * bok;
    }

    double obliczObjetosc() {
        return bok * bok * bok;
    }

    public void viewData() {
        System.out.println("Sześcian - Bok: " + bok + ", Pole: " + obliczPole() + ", Objętość: " + obliczObjetosc());
    }
}

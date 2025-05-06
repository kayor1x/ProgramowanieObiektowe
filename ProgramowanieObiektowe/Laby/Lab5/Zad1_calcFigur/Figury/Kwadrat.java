package Figury;

public class Kwadrat {
    double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    double obliczPole() {
        return bok * bok;
    }

    double obliczObwod() {
        return 4 * bok;
    }

    public void viewData() {
        System.out.println("Kwadrat - Bok: " + bok + ", Pole: " + obliczPole() + ", Obwód: " + obliczObwod());
    }
}

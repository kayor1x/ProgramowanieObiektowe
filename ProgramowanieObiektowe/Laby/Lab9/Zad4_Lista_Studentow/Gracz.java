public class Gracz {
    String pseudonim;
    String imie;
    int wiek;

    public Gracz(String pseudonim, String imie, int wiek) {
        this.pseudonim = pseudonim;
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Gracz{" +
                "pseudonim='" + pseudonim + '\'' +
                ", imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}

public abstract class Pojazd {
    String marka;
    String model;
    boolean czyDostepny;
    double cenaZaGodzine;

    public Pojazd(String marka, String model, double cenaZaGodzine, boolean czyDostepny) {
        this.marka = marka;
        this.model = model;
        this.cenaZaGodzine = cenaZaGodzine;
        this.czyDostepny = czyDostepny;
    }
    public abstract void wyswietlInfo();


}

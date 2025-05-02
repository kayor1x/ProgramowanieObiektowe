public class Rower extends Pojazd{
    boolean maKoszyk;

    public Rower(String marka, String model, boolean czyDostepny, double cenaZaGodzine, boolean maKoszyk) {
    super(marka,model,cenaZaGodzine,czyDostepny);
    this.maKoszyk = maKoszyk;
    }
    public void wyswietlInfo(){
        System.out.println("=====Rower===== \nMarka: " + marka + "\nModel: " + model + "\nCena za Godzine: " + cenaZaGodzine + "\nCzy dostepny?: " + czyDostepny +"\nCzy ma koszyk?" + maKoszyk);
    }
}

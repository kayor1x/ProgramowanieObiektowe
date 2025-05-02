public class Samochod1 extends Pojazd{
    String nadwozie;

    public Samochod1(String marka, String model, boolean czyDostepny, double cenaZaGodzine, String nadwozie){
        super(marka,model,cenaZaGodzine,czyDostepny);
        this.nadwozie=nadwozie;
    }

    public void wyswietlInfo(){
        System.out.println("=====Samochod===== \nMarka: " + marka + "\nModel: " + model + "\nNadwozie: " + nadwozie + "\nCena za Godzine: " + cenaZaGodzine + "\nCzy dostepny?: " + czyDostepny);
    }


}

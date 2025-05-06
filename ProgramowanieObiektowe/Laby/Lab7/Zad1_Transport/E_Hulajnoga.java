public class E_Hulajnoga extends Pojazd {
    String pojemnoscAkumulatora;

    public E_Hulajnoga(String marka, String model, boolean czyDostepny, double cenaZaGodzine, String pojemnoscAkumulatora){
        super(marka,model,cenaZaGodzine,czyDostepny);
        this.pojemnoscAkumulatora = pojemnoscAkumulatora;
    }
    public void wyswietlInfo(){
        System.out.println("=====E_Hulajnoga===== \nMarka: " + marka + "\nModel: " + model + "\nCena za Godzine: " + cenaZaGodzine + "\nCzy dostepny?: " + czyDostepny +"\nPojemność akumulatora: " + pojemnoscAkumulatora);
    }
}

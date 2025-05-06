public class Podrecznik extends Ksiazka{
    String przedmiot;

    public Podrecznik(String tytul, String autor, double cena,String przedmiot){
        super(tytul,autor,cena);
        this.przedmiot=przedmiot;
    }
    String getPrzedmiot(){return przedmiot;}
    void setPrzedmiot(String przedmiot){this.przedmiot=przedmiot;}
    public void wyswietlInfo(){
        super.wyswietlInfo();
        System.out.println("Przedmiot:"+przedmiot +'\n');
    }
}

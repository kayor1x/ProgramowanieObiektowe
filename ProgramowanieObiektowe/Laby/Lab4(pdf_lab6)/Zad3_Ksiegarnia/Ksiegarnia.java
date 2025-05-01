
public class Ksiegarnia {
    String nazwa;
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;
    private Klient[] klienci;
    int liczbaKlientow;

    public Ksiegarnia(String nazwa){
        this.nazwa = nazwa;
        this.ksiazki = new Ksiazka[100];
        this.klienci = new Klient[100];
        this.liczbaKsiazek = 0;
        this.liczbaKlientow = 0;
    }

    int getLiczbaKsiazek(){return this.liczbaKsiazek;}
    int getLiczbaKlientow(){return this.liczbaKlientow;}
    void dodajKsiazke(Ksiazka ksiazka){
        ksiazki[liczbaKsiazek] = ksiazka;
        liczbaKsiazek++;
    }
    void dodajKlienta(Klient klient){
        klienci[liczbaKlientow] = klient;
        liczbaKlientow++;
    }
    void wyswietlKsiazke(int index){
        ksiazki[index].wyswietlInfo();
    }
    void wyswietlKlienta(int index){
        klienci[index].wyswietlInfo();
    }
}

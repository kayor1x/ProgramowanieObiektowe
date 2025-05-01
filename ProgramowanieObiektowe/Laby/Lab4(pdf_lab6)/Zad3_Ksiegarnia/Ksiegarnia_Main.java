public class Ksiegarnia_Main {
    public static void main(String[] args) {
        Ksiegarnia ksiegarnia = new Ksiegarnia("Moja Księgarnia");

        Podrecznik matma = new Podrecznik("Podstawy matematyki", "Jan Kowalski", 50.0, "Matematyka");
        Powiesc kryminal = new Powiesc("agent007", "Are", 40.0, "Kryminał");

        Ksiazka ks1 = matma;
        Ksiazka ks2 = kryminal;

        ksiegarnia.dodajKsiazke(ks1);
        ksiegarnia.dodajKsiazke(ks2);

        Klient klient1 = new Klient("Anna", "Nowak");
        ksiegarnia.dodajKlienta(klient1);

        ksiegarnia.wyswietlKsiazke(0);
        ksiegarnia.wyswietlKsiazke(1);
        ksiegarnia.wyswietlKlienta(0);

        if (ks1 instanceof Podrecznik) {
            Podrecznik p = (Podrecznik) ks1;
            p.wyswietlInfo();
        }

        if (ks2 instanceof Powiesc) {
            Powiesc p = (Powiesc) ks2;
            p.wyswietlInfo();
        }
    }
}

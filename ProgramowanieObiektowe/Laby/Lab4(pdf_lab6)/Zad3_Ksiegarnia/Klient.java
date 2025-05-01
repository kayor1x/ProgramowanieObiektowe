public class Klient {
    String imie, nazwisko;

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    String getImie(){return imie;};
    String getNazwisko(){return nazwisko;};
    void setImie(String imie){this.imie = imie;};
    void setNazwisko(String nazwisko){this.nazwisko = nazwisko;};
    void wyswietlInfo(){
        System.out.println("Imie:"+imie+" \nnazwisko:"+nazwisko +"\n");
    }

}

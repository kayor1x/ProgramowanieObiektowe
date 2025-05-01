public class Ksiazka {
    String tytul;
    String autor;
    double cena;

    public Ksiazka(String tytul, String autor, double cena){
        this.tytul = tytul;
        this.autor = autor;
        this.cena = cena;
    }

    String getTytul(){return tytul;}
    String getAutor(){return autor;}
    double getCena(){return cena;}
    void setTytul(String tytul){this.tytul = tytul;}
    void setAutor(String autor){this.autor = autor;}
    void setCena(double cena){this.cena = cena;}
    public void wyswietlInfo(){
        System.out.println("Tytul: "+tytul + "\nAutor:" + autor + "\nCena:" + cena);
    }
}

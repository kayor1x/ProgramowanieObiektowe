public class Powiesc extends Ksiazka {
    String gatunek;

    public Powiesc(String tytul, String autor, double cena,String gatunek){
        super(tytul, autor, cena);
        this.gatunek=gatunek;
    }
    String getGatunek(){return gatunek;}
    void setGatunek(String gatunek){}
    public void wyswietlInfo(){
        super.wyswietlInfo();
        System.out.println("Gatunek:"+gatunek +'\n');
    }


}

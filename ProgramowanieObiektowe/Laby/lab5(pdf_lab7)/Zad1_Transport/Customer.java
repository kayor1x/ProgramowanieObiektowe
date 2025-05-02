public class Customer {
    String imie;
    Pojazd p;
    public Customer(String imie) {
        this.imie = imie;
        this.setP(null);
    }


    public void wyswietlWypozyczonyPojazd(){
       p.wyswietlInfo();
    }

    public Pojazd getP() {
        return p;
    }

    public void setP(Pojazd p) {
        this.p = p;
    }
}

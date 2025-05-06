class Gatunek {
    String nazwaRodzaju;
    String nazwaGatunkowa;
    int liczbaChromosomow2n;
    int podstawowaLiczbaChromosomowX;
    String opis;

    Gatunek(String nazwaRodzaju, String nazwaGatunkowa, int liczbaChromosomow2n, int podstawowaLiczbaChromosomowX, String opis) {
        this.nazwaRodzaju = nazwaRodzaju;
        this.nazwaGatunkowa = nazwaGatunkowa;
        this.liczbaChromosomow2n = liczbaChromosomow2n;
        this.podstawowaLiczbaChromosomowX = podstawowaLiczbaChromosomowX;
        this.opis = opis;
    }

    Gatunek(){
        this.nazwaRodzaju = "Unnamed";
        this.nazwaGatunkowa = "Unnamed";
        this.liczbaChromosomow2n = 0;
        this.podstawowaLiczbaChromosomowX = 0;
        this.opis = "No description";
    }
    public String pelnaNazwa() {
        return nazwaRodzaju + " " + nazwaGatunkowa;
    }

    public int haploidalnaLiczbaChromosomowN() {
        return liczbaChromosomow2n / 2;
    }

    public void viewData() {
        System.out.println("Pełna nazwa: " + pelnaNazwa());
        System.out.println("Liczba chromosomów 2n: " + liczbaChromosomow2n);
        System.out.println("Podstawowa liczba chromosomów x: " + podstawowaLiczbaChromosomowX);
        System.out.println("Haploidalna liczba chromosomów n: " + haploidalnaLiczbaChromosomowN());
        System.out.println("Opis: " + opis);
        System.out.println("----------------------");
    }

    public Gatunek cloneGatunek() {
        return new Gatunek(nazwaRodzaju, nazwaGatunkowa, liczbaChromosomow2n, podstawowaLiczbaChromosomowX, opis);
    }
}
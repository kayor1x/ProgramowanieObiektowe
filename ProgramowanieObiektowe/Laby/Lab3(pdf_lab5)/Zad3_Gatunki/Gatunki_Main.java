

public class Gatunki_Main {
    public static void main(String[] args) {
        Gatunek g1 = new Gatunek();
        Gatunek g2 = new Gatunek("Felis", "catus", 38, 19, "Kot domowy, popularne zwierzę domowe.");
        Gatunek g3 = new Gatunek("Homo", "sapiens", 46, 23, "Człowiek współczesny.");

        System.out.println(g1.pelnaNazwa());
        System.out.println(g2.pelnaNazwa());
        System.out.println(g3.pelnaNazwa());

        System.out.println(g1.haploidalnaLiczbaChromosomowN());
        System.out.println(g2.haploidalnaLiczbaChromosomowN());
        System.out.println(g3.haploidalnaLiczbaChromosomowN());

        g1.viewData();
        g2.viewData();
        g3.viewData();

        Gatunek g4 = g3.cloneGatunek();

        g4.viewData();


    }
}

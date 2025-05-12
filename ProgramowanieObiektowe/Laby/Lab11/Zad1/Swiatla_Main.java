public class Swiatla_Main {
    enum Swiatlo {
        CZERWONE("Stój!"),
        ZOLTE("Uwaga!"),
        ZIELONE("Jedź!");
        private String opis;

        // Konstruktor
        Swiatlo(String opis) {
            this.opis = opis;
        }

        public String getOpis() {
            return opis;
        }
    }

    public static void main(String[] args) {
        Swiatlo czerw = Swiatlo.CZERWONE;
        Swiatlo zolte = Swiatlo.ZOLTE;
        Swiatlo ziel = Swiatlo.ZIELONE;
        System.out.println(czerw + " " +czerw.getOpis());
        System.out.println(zolte + " " +zolte.getOpis());
        System.out.println(ziel + " " +ziel.getOpis());
    }
}


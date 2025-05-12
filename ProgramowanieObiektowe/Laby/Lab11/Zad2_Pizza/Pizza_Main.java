public class Pizza_Main {
    public enum PizzaSize {
        MALA(25, 18.99),
        SREDNIA(30, 25.99),
        DUZA(40, 32.99);

        private int srednica;
        private double cena;

        PizzaSize(int srednica, double cena) {
            this.srednica = srednica;
            this.cena = cena;
        }

        public int getSrednica() {
            return srednica;
        }

        public double getCena() {
            return cena;
        }
    }

    public static void main(String[] args) {
        PizzaSize mala = PizzaSize.MALA;
        PizzaSize srednia = PizzaSize.SREDNIA;
        PizzaSize duza = PizzaSize.DUZA;

        System.out.println("Cena malej pizzy: " + mala.cena);
        System.out.println("Srednica malej pizzy: " + mala.srednica);
        System.out.println("Cena sredniej pizzy: " + srednia.cena);
        System.out.println("Srednica sredniej pizzy: " + srednia.srednica);
        System.out.println("Cena dużej pizzy: " + duza.getCena());
        System.out.println("Srednica dużej pizzy: " + duza.getSrednica());
    }
}

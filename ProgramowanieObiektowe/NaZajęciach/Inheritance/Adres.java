package Inheritance;

public class Adres {
    String ulica, nrDomu, nrMieszkania;
    String kodPocztowy, miasto;

    public Adres(String ulica, String nrDomu, String nrMieszkania, String kodPocztowy, String miasto) {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.nrMieszkania = nrMieszkania;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;


    }

    private void viewAdres() {
        System.out.println("Adres: " + ulica + " nr domu: " + nrDomu + " nr mieszkania: + " + nrMieszkania + " kod pocztowy: " + kodPocztowy + " miasto: " + miasto);
    }
}
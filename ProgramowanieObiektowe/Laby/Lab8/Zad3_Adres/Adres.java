public class Adres {
    String ulica;
    int numerDomu;
    String kodPocztowy;
    String miasto;

    public Adres(String ulica, int numerDomu, String kodPocztowy, String miasto) {
        String blad = "";
        if (ulica == null) {
            blad = blad.concat("\nUlica nie może być nullem. ");
        }
        if (numerDomu <= 0) {
            blad = blad.concat("\nNumer nie moze byc rowny lub mniejszy od zera. ");
        }
        if (kodPocztowy == null) {
            blad = blad.concat("\nKod pocztowy nie moze byc nullem. ");
        }
        if (miasto == null){
            blad = blad.concat("\nMiasto nie moze byc nullem. ");
        }
        if(blad.length() > 0){
            throw new NieprawidlowyAdresException(blad);
        }
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }
}

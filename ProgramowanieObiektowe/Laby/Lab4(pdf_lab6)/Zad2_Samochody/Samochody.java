
public class Samochody {
    public static void main(String[] args) {
        SamochodOsobowy osobowy = new SamochodOsobowy();
        Samochod s1 = new Samochod();

        Samochod s2 = new Samochod("Toyota", "Corolla", "Sedan", "Srebrny", 2019, 55000);

        osobowy.wyswietlInfo();
        s1.wyswietlInfo();
        s2.wyswietlInfo();
    }
}

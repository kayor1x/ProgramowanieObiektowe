import java.util.Scanner;

public class Transport_Main {
    public static void main(String[] args) {
        Wypozyczalnia w = new Wypozyczalnia();
        Scanner scanner = new Scanner(System.in);

        Rower rower = new Rower("Kross", "Hexagon", true, 15.0, true);
        E_Hulajnoga hulajnoga = new E_Hulajnoga("Xiaomi", "Pro2", true, 20.0, "4500mAh");
        Samochod1 samochod = new Samochod1("Toyota", "Corolla", true, 50.0, "sedan");

        w.dodajPojazd(rower);
        w.dodajPojazd(hulajnoga);
        w.dodajPojazd(samochod);

        Customer klient = new Customer("Anna");

        w.wyswietlPojazdy();
        System.out.println("Wpisz na ile czasu chcesz wypozyczyc i index pojazdu: ");
        System.out.println(w.obliczKoszt(scanner.nextInt(), scanner.nextInt()));
        System.out.println("kosztuje wypozyczenie tego pojazdu");
        w.wypozyczPojazd(klient);

        System.out.println("\nPojazd wypożyczony przez klienta:");
        if (klient.getP() != null) {
            klient.wyswietlWypozyczonyPojazd();
        }

        w.zwrocPojazd(klient);

        System.out.println("\nPojazdy dostępne po zwrocie:");
        w.wyswietlPojazdy();

    }
}

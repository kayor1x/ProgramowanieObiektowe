public class Budynki_Main {
    public static void main(String[] args) {
        Budynek b1 = new Budynek();
        Budynek b2 = new Budynek("Uczelnia", 2007, 3);
        Budynek b3 = new Budynek("Szkoła", 1950, 2);

        b1.viewData();
        b2.viewData();
        b3.viewData();

        System.out.println(b1.ile_lat());
        System.out.println(b2.ile_lat());
        System.out.println(b3.ile_lat());
    }
}

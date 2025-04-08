import java.util.Scanner;
class SamochodOsobowy extends Samochod {
    private double waga; // w tonach
    private double pojemnoscSilnika;
    private int iloscOsob;

    public SamochodOsobowy() {
        super();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wagę (2.0 - 4.5 t): ");
        double wagaInput = scanner.nextDouble();
        if (wagaInput >= 2.0 && wagaInput <= 4.5) {
            this.waga = wagaInput;
        } else {
            System.out.println("Niepoprawna waga. Ustawiono 2.0 t.");
            this.waga = 2.0;
        }
        System.out.print("Podaj pojemność silnika (0.8 - 3.0): ");
        double pojemnoscInput = scanner.nextDouble();
        if (pojemnoscInput >= 0.8 && pojemnoscInput <= 3.0) {
            this.pojemnoscSilnika = pojemnoscInput;
        } else {
            System.out.println("Niepoprawna pojemność. Ustawiono 0.8.");
            this.pojemnoscSilnika = 0.8;
        }

        System.out.print("Podaj ilość osób: ");
        this.iloscOsob = scanner.nextInt();
    }

    @Override
    public void wyswietlInfo() {
        super.wyswietlInfo();
        System.out.println("Waga: " + waga + " t");
        System.out.println("Pojemność silnika: " + pojemnoscSilnika + " l");
        System.out.println("Ilość osób: " + iloscOsob);
    }
}

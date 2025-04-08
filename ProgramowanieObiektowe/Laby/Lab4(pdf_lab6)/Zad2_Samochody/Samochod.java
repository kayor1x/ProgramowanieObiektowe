import java.util.Scanner;

class Samochod {
    protected String marka;
    protected String model;
    protected String nadwozie;
    protected String kolor;
    protected int rokProdukcji;
    protected int przebieg;

    public Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        if (przebieg >= 0) {
            this.przebieg = przebieg;
        } else {
            System.out.println("Przebieg nie może być ujemny. Ustawiono 0.");
            this.przebieg = 0;
        }
    }
    public Samochod() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj markę: ");
        this.marka = scanner.nextLine();

        System.out.print("Podaj model: ");
        this.model = scanner.nextLine();

        System.out.print("Podaj nadwozie: ");
        this.nadwozie = scanner.nextLine();

        System.out.print("Podaj kolor: ");
        this.kolor = scanner.nextLine();

        System.out.print("Podaj rok produkcji: ");
        this.rokProdukcji = scanner.nextInt();

        System.out.print("Podaj przebieg: ");
        int przebiegInput = scanner.nextInt();
        if (przebiegInput >= 0) {
            this.przebieg = przebiegInput;
        } else {
            System.out.println("Przebieg nie może być ujemny. Ustawiono 0.");
            this.przebieg = 0;
        }
    }

    public void wyswietlInfo() {
        System.out.println("\nSamochód:");
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Nadwozie: " + nadwozie);
        System.out.println("Kolor: " + kolor);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Przebieg: " + przebieg + " km");
    }
}


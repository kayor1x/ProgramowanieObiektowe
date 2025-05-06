import Figury.*;

import java.util.Scanner;

public class DzialaniaNaFigurach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz figurę: 1-Koło, 2-Kwadrat, 3-Prostokąt, 4-Sześcian, 5-Prostopadłościan, 6-Kula, 7-Stożek");
        int wybor = scanner.nextInt();

        switch (wybor) {
            case 1 -> {
                System.out.print("Podaj promień: ");
                new Kolo(scanner.nextDouble()).viewData();
            }
            case 2 -> {
                System.out.print("Podaj bok: ");
                new Kwadrat(scanner.nextDouble()).viewData();
            }
            case 3 -> {
                System.out.print("Podaj długość i szerokość: ");
                new Prostokat(scanner.nextDouble(), scanner.nextDouble()).viewData();
            }
            case 4 -> {
                System.out.print("Podaj bok: ");
                new Szescian(scanner.nextDouble()).viewData();
            }
            case 5 -> {
                System.out.print("Podaj długość, szerokość i wysokość: ");
                new Prostopadloscian(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()).viewData();
            }
            case 6 -> {
                System.out.print("Podaj promień: ");
                new Kula(scanner.nextDouble()).viewData();
            }
            case 7 -> {
                System.out.print("Podaj promień i wysokość: ");
                new Stozek(scanner.nextDouble(), scanner.nextDouble()).viewData();
            }
            default -> System.out.println("Nieprawidłowy wybór.");
        }
        scanner.close();
    }
}

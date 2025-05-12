import java.nio.file.FileSystemNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dania_Main {


    static public void main(String[] args) {
        Map<String, Double> dania = new HashMap<String, Double>();
        Scanner sc = new Scanner(System.in);
        int wybor;
        System.out.println("Witam w restauracji!\nZłoż zamowienie: ");
        while (true) {
            System.out.println("1. Dodać danie\n2. Wyswietlic kartę\n3. Usunąć danie\n4. Obliczyć cały rachunek\n0. Wyjść z programu ");
            wybor = sc.nextInt();
            sc.nextLine();
            if (wybor == 0) {
                System.out.println("Dziękuję, miłego dnia!");
                break;
            }
            switch (wybor) {
                case 1:
                    String nazwa;
                    System.out.print("Jakie danie? - ");
                    nazwa = sc.nextLine();
                    double cena;
                    System.out.print("Cena: ");
                    cena = sc.nextDouble();
                    dania.put(nazwa, cena);
                    System.out.println("Dodano: " + nazwa + " - " + cena + " zł");
                    break;
                case 2:
                    for(Map.Entry<String, Double> entry : dania.entrySet()){
                        System.out.println(entry.getKey() + " - " + entry.getValue() + " zł");
                    }
                    break;
                case 3:
                    System.out.println("Co usunąć? - ");
                    nazwa = sc.nextLine();
                    dania.remove(nazwa);
                    break;
                case 4:
                    int suma = 0;
                    for(Map.Entry<String, Double> entry : dania.entrySet()){
                        suma += entry.getValue();
                    }
                    System.out.println("Rachunek za " + dania.keySet() +": " + suma);
            }
        }
    }
}

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Imiona {
    public static void main(String[] args){
        String imie = "0";
        Scanner scanner = new Scanner(System.in);
        Set<String> imiona = new HashSet<>();
        do {
            System.out.println("\nWpisz imie:");
            imie = scanner.next();
            if(imie.equals("-")){
                break;
            } else imiona.add(imie.toLowerCase());
        } while(!imie.equals("-"));
        for (String im : imiona){
            System.out.print(im + " ");
        }
        System.out.println("Wpisales " + imiona.size() + " unikalnych imion.");
    }
}

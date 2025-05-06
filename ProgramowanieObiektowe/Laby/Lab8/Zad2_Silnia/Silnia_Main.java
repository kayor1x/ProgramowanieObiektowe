import java.util.Scanner;

public class Silnia_Main {
    public static int factorial(int liczba) throws BlednaWartoscDlaSilniException {
        if (liczba < 0)
            throw new BlednaWartoscDlaSilniException("liczba >= 0");
        if(liczba == 1)
            return liczba;
        liczba = liczba * factorial(liczba-1);
        return liczba;
    }
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Liczba: ");
            int liczba = sc.nextInt();
            sc.close();
            System.out.println(factorial(liczba));
        } catch (BlednaWartoscDlaSilniException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}

import java.util.Scanner;

public class Pierwiastek_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz liczbę:");
        double liczba = sc.nextDouble();
        if  (liczba < 0) {
            throw new IllegalArgumentException("Bledny argument, liczba >= 0!");

        } else if(liczba != (double) liczba){
            throw new IllegalArgumentException("Bledny argument!, liczba == double");
        } else {
            double pierwiatek = Math.sqrt(liczba);
            System.out.println("Pierwiatek " + liczba +" = " + pierwiatek);
        }
    }
}

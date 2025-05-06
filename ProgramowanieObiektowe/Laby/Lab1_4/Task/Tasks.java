package Task;

import RunInput.Input;

import java.util.Random;

public class Tasks {

    Input input = new Input();

    Random rand = new Random();
    // LAB 1
    // zad1
    public String DataUser() { //zad1
        return "Yevhenii Usik, 17(wkrótce 18)";
    }

    //zad2
    public void MathOperations() {
        System.out.println("Input a b: ");
        float a = input.InputFloat();
        float b = input.InputFloat();
        float sum = a + b;
        float rozn = a - b;
        float ilocz = a * b;
        System.out.println("a + b = " + sum + ", a - b =" + rozn + ", a * b = " + ilocz);
    }

    //zad3
    public boolean parzNieparz() {
        System.out.println("Input a: ");
        float a = input.InputFloat();
        return a % 2 == 0;
    }

    //zad4
    public boolean podziel() {
        System.out.println("Input a: ");
        float a = input.InputFloat();
        return (a % 3 == 0) && (a % 5 == 0);
    }

    //zad5
    public void potega() {
        System.out.println("Input a: ");
        float a = input.InputFloat();
        System.out.println(a * a * a);
    }

    //zad6
    public void perwiastek() {
        System.out.println("Input a: ");
        float a = input.InputFloat();
        double result = Math.sqrt(a);
        System.out.println(result);
    }

    //zad7
    public boolean trojkat() {
        System.out.println("Input a(min) b(max): ");
        int a = input.InputInt();
        int b = input.InputInt();
        int n1 = a + (int) (Math.random() * ((b - a) + 1));
        int n2 = a + (int) (Math.random() * ((b - a) + 1));
        int n3 = a + (int) (Math.random() * ((b - a) + 1));
        return (n1 * n1) + (n2 * n2) == (n3 * n3);
    }

    // LAB 2
    // zad1
    public void rownanieKwad() {
        System.out.println("Input a(a!=0) b c: ");
        int a = input.InputInt();
        if (a == 0)
            return;
        int b = input.InputInt();
        int c = input.InputInt();
        System.out.println(a + "x^2+" + b + "x+" + c + "=0\n");
        if (b == 0 && c != 0) {
            System.out.println("x = sqrt(c/a) = " + Math.sqrt((double) c / a));
            return;
        }
        if (b != 0 && c == 0) {
            System.out.println("x1 = 0, x2 = " + b / a);
            return;
        }
        int delta = (b * b) - (4 * a * c);
        System.out.println("delta = (b*b)-(4*a*c) = " + delta);
        if (delta < 0) {
            System.out.println("delta < 0, brak pierwiastków");
            return;
        }
        double sqrtDelta = Math.sqrt(delta);
        double x1 = ((-b - sqrtDelta) / 2 * a);
        double x2 = ((-b + sqrtDelta) / 2 * a);
        System.out.println("x1= ((-b - sqrtDelta) / 2*a) = " + x1 + ", x2 = ((-b + sqrtDelta) / 2*a) = " + x2);
    }

    //zad2
    public void wartosc_f() {
        float x;
        System.out.println("Input x: ");
        x = input.InputFloat();
        if (x > 0 && x < 1 || x <= 0) {
            if (x < 0)
                System.out.println("a(" + x + ") = -3*" + x + " = " + -3 * x);
            if (x == 0)
                System.out.println("a(0) = 0");
            if (x > 0)
                System.out.println("a(" + x + ") = 2*" + x + " = " + 2 * x);
        }
        if (x > 0 && x < 1 || x >= 1 && x < 2) {
            if (x < 1)
                System.out.println("b(" + x + ") = " + x);
            if (x >= 1)
                System.out.println("b(" + x + ") = " + x + "^2 = " + x * x);
        }
        if (x <= 2 && x > 1 || x > 2) {
            if (x > 2)
                System.out.println("c(" + x + ") = -3*" + x + " = " + -3 * x);
            if (x == 2)
                System.out.println("c(2) = 8");
            if (x < 2) {
                System.out.println("c(" + x + ") = " + x + "-4 = " + (x - 4));
            }
        }
    }

    //zad3
    public void sortInputs() {
        float x, y, z;
        System.out.println("Input X, Y, Z: ");
        x = input.InputFloat();
        y = input.InputFloat();
        z = input.InputFloat();
        if (x > y && y > z) {
            System.out.println(x + " > " + y + " > " + z);
        }
        if (y > z && z > x) {
            System.out.println(y + " > " + z + " > " + x);
        }
        if (z > y && y > x) {
            System.out.println(z + " > " + y + " > " + x);
        }
        if (x > z && z > y) {
            System.out.println(x + " > " + z + " > " + y);
        }
        if (z > x && x > y) {
            System.out.println(z + " > " + x + " > " + y);
        }
        if (y > x && x > z) {
            System.out.println(y + " > " + x + " > " + z);
        }
    }

    //zad 4
    public void weather() {
        boolean isRaining, isBusAtStop;
        System.out.println("Czy pada deszcz? - (true/false)");
        isRaining = input.InputBoolean();
        System.out.println("Czy jest autobus na przystanku? - (true/false)");
        isBusAtStop = input.InputBoolean();
        if (isRaining && isBusAtStop) {
            System.out.println("Weź parasol");
            System.out.println("Dostaniesz się na uczelnię");
        } else if (isRaining && !isBusAtStop) {
            System.out.println("Nie dostaniesz się na uczelnię");
        } else if (!isRaining && isBusAtStop) {
            System.out.println("Dostaniesz się na uczelnię");
            System.out.println("Miłego dnia i pięknej pogody");
        }
    }
    //zad 5
    public void buyCar() {
        boolean hasDiscount, gotBonus;
        System.out.println("Czy otrzymałeś premię? - (true/false)");
        gotBonus = input.InputBoolean();
        System.out.println("Czy jest zniżka na samochód? - (true/false)");
        hasDiscount = input.InputBoolean();
        if (gotBonus) {
            System.out.println("Możesz kupić samochód!");
            if (!hasDiscount) {
                System.out.println("Zniżki na samochód nie ma");
            }
        } else {
            System.out.println("Zakup samochodu trzeba odłożyć na później...");
            System.out.println("Zniżki na samochód nie ma");
        }
    }
    //zad 6
    public void calculator() {
        char selection;
        int x, y;
        do {
            System.out.println("Wpisz przykład(np. -5 + 10, 100 % 3): ");
            x = input.InputInt();
            selection = input.InputChar();
            y = input.InputInt();
            switch (selection) {
                case '+':
                    System.out.println(x + " + " + y + " = " + (x + y));
                    break;
                case '-':
                    System.out.println(x + " - " + y + " = " + (x - y));
                    break;
                case '*':
                    System.out.println(x + " * " + y + " = " + x * y);
                    break;
                case '/':
//                    x = input.InputInt();
//                    y = input.InputInt();
                    System.out.println(x + " / " + y + " = " + x / y);
                    break;
                case '%':
//                    x = input.InputInt();
//                    y = input.InputInt();
                    System.out.println(x + " % " + y + " = " + x % y);
                    break;

            }
        } while (true);
    }
    //lab 3
    //zad 1
    public void sredniaLiczbaPunktow (){
        System.out.println("Wpisz n: ");
        int n = input.InputInt();
        float srednia = 0;
        int i = 1;
        while (i <= n){
            System.out.println("Wpisz punkty studenta nr" + i + ": ");
            srednia += input.InputFloat();
            i++;
        }
        srednia /= n;
        System.out.println("Srednia: " + srednia);
    }
    //zad 2
    public void sumaiIlosc (){
        int ujemne = 0;
        int dodatne = 0;
        int sumaDodatnich = 0;
        int sumaUjemnych = 0;
        int i = 1;

        while (i <= 10){
            int liczba = 0;
            System.out.println("Wpisz " + i + " liczbę: ");
            liczba += input.InputInt();
            if (liczba < 0){
                ujemne++;
                sumaUjemnych += liczba;
            }
            if (liczba >= 0) {
                dodatne++;
                sumaDodatnich += liczba;
            }
            i++;
        }
        System.out.println("Ijemnych: " + ujemne + ", suma ujemnych: " + sumaUjemnych + "\n Dodatnich: " + dodatne + ", suma dodatnich: " + sumaDodatnich);
    }
    //zad 3
    public void ciagParz(){
        int i = 1;
        float sumaParz = 0;
        System.out.println("Wpisz n: ");
        int n = input.InputInt();
        while (i <= n){
            System.out.println("Wpisz " + i + "  liczbę: ");
            float liczba = input.InputFloat();
            if (liczba%2 != 1)
                sumaParz += liczba;
            i++;
        }

        System.out.println("Suma parzystych: " + sumaParz);

    }
    //zad 4
    public void losoweParzyste(){
        System.out.println("Wpisz n: ");
        int n = input.InputInt();
        int i = 1;
        int liczba;
        int sumaParz = 0;
        while (i <= n){
            liczba = rand.nextInt(45-(-10)+1)-10;
            System.out.println(i + ". " + liczba);
            if(liczba % 2 != 1){
                sumaParz += liczba;
            }
            i++;
        }
        System.out.println("Suma parzystych wylosowanych z przedziału [-10:45]: " + sumaParz);
    }
    // zad5
    public boolean czyPalindrom(){
        System.out.println("Podaj słowo: ");
        String slowo = input.InputString();
        int i = 0;
        int j = slowo.length()-1;
        while (i <= j){
            if (slowo.charAt(i) != slowo.charAt(j)){
                System.out.println(slowo + "nie jest palindromem");
                return false;
            }
            i++;
            j--;
        }
        System.out.println(slowo + " jest palindromem");
        return true;
    }
    //lab 4

    //zad 1
    public void tabSumaSrednia(){
        System.out.println("Wpisz przedziały x (x<y) i y (y>x): ");
        int x = input.InputInt();
        int y = input.InputInt();
        System.out.println("Wpisz rozmiar n tablicy: ");
        int n = input.InputInt();
        int[] tab = new int[n];
        for (int i = 0; i < n; i++){
            tab[i] = rand.nextInt((y-x+1)+x);
        }
        int suma = 0;
        int srednia = 0;
        for (int num : tab){
            suma += num;
            srednia += num;
        }
        System.out.println("Suma: " + suma + ", Srednia: " + srednia/n);
    }
    //zad 2
    public void coDrugiElem(){
        int[] tab1 = {5,3,7,1,9,4};
        int[] tab2 = {1,10,15,23,11};
        for(int i = 0 ; i < tab1.length ; i+=2){
            System.out.print(tab1[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < tab2.length ; i+=2){
            System.out.print(tab2[i] + " ");
        }
        System.out.println();

    }
    //zad 3
    public void tabString(){
        String[] tab = {"czlowiek", "uniwersytet", "student", "lekcja"};
        for(String str: tab){
            System.out.println(str.toUpperCase());
        }

    }
    //zad 4
    public void reverseText() {
        String[] tab = new String[5];
        for (int i = 0; i <= 4; i++) {
            System.out.print("Podaj " + (i+1) + " słowo: ");
            tab[i] = input.InputString();
        }
        System.out.println("\nReversed text: ");
        for (int i = 4; i >= 0; i--) {
            System.out.println(new StringBuilder(tab[i]).reverse());
        }
    }
    //zad 5
    public void sortIntTab(){
        int[] tab = new int[8];
        for (int i = 0; i < tab.length; i++){
            System.out.println("Wpisz " + (i+1) + "  liczbe: ");
            tab[i] = input.InputInt();
        }
        System.out.println("\nSorting tab: ");
        for (int i = 0; i < tab.length; i++){
            for (int j = 0; j < tab.length; j++){
                if (tab[i] < tab[j]){
                    int temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }
        }
        for (int x: tab){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    //zad 6
    public void silniaTab() {
        int[] tab = new int[5];
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Wpisz " + (i + 1) + " liczbe: ");
            tab[i] = input.InputInt();
        }

        for(int x: tab){
            int silnia = 1;
            for(int i = x; i > 0; i--){
                silnia *= i;
            }
            System.out.println(silnia + " ");

        }
    }
    //zad 7
    public void tabStringCompare(){
        String[] tab = {"czlowiek", "uniwersytet", "student", "lekcja"};
        String[] tab1 = {"czlowiek", "uniwersytet", "student", "lekcja"};
        for(int i = 0 ; i < tab.length ; i++){
            if(tab[i].compareTo(tab1[i]) != 0){
                System.out.println("Rozne");
                return;
            }
        }
        System.out.println("Takie same");

    }
}
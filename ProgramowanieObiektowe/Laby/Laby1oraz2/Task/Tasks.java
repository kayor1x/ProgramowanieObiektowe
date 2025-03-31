package Task;

import RunInput.Input;

public class Tasks {

    Input input = new Input();

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

    //zad 3
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

    public void calculator() {
        char selection;
        int x, y;
        while (true) {
            System.out.println("Wpisz przykład(np. -5 + 10, 100 % 3): ");
            x = input.InputInt();
            selection = input.InputChar();
            y = input.InputInt();
//            System.out.println("Wpisz liczby x y: ");
            switch (selection) {
                case '+':
//                    x = input.InputInt();
//                    y = input.InputInt();
                    System.out.println(x + " + " + y + " = " + (x + y));
                    break;
                case '-':
//                    x = input.InputInt();
//                    y = input.InputInt();
                    System.out.println(x + " - " + y + " = " + (x - y));
                    break;
                case '*':
//                    x = input.InputInt();
//                    y = input.InputInt();
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
        }
    }
}
package Task;
import RunInput.Input;
public class Tasks {

    Input input = new Input();
    // LAB 1
    public String DataUser(){ //zad1
        return "Yevhenii Usik, 17(wkrótce 18)";
    }
    public void MathOperations(){//zad2
        System.out.println("Input a b: ");
        float a = input.InputFloat();
        float b = input.InputFloat();
        float sum = a+b;
        float rozn = a-b;
        float ilocz = a*b;
        System.out.println("a + b = " + sum + ", a - b =" + rozn + ", a * b = " + ilocz);
    }
    public boolean parzNieparz(){//zad3
        System.out.println("Input a: ");
        float a = input.InputFloat();
        if (a % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean podziel(){//zad4
        System.out.println("Input a: ");
        float a = input.InputFloat();
        if ((a % 3 == 0) && (a % 5 == 0)){
            return true;
        }
        else{
            return false;
        }
    }
    public void potega(){//zad5
        System.out.println("Input a: ");
        float a = input.InputFloat();
        System.out.println(a*a*a);
    }
    public void perwiastek(){//zad6
        System.out.println("Input a: ");
        float a = input.InputFloat();
        double result = Math.sqrt(a);
        System.out.println(result);
    }
    public boolean trojkat(){//zad7
        System.out.println("Input a(min) b(max): ");
        int a = input.InputInt();
        int b = input.InputInt();
        int n1 = a + (int)(Math.random() * ((b-a) + 1));
        int n2 = a + (int)(Math.random() * ((b-a) + 1));
        int n3 = a + (int)(Math.random() * ((b-a) + 1));
        if ((n1*n1) + (n2*n2) == (n3*n3))
            return true;
        return false;
    }
    // LAB 2
    public boolean rownanieKwad(){//zad1
        System.out.println("Input a(a!=0) b c: ");
        int a = input.InputInt();
        if (a == 0)
            return false;
        int b = input.InputInt();
        int c = input.InputInt();
        System.out.println(a + "x^2+" + b + "x+" + c + "=0\n");
        int delta = (b*b)-(4*a*c);
        System.out.println("delta = (b*b)-(4*a*c) = " + delta);
        double sqrtDelta = Math.sqrt(delta);
        double x1 = ((-b - sqrtDelta) / 2*a);
        double x2 = ((-b + sqrtDelta) / 2*a);
        System.out.println("x1 = " + x1 + ", x2 = " + x2);
        return true;
    }

}

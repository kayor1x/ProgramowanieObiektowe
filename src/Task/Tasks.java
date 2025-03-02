package Task;
import RunInput.Input;
public class Tasks {

    Input input = new Input();
    public String DataUser(){
        return "Yevhenii Usik, 17(wkrótce 18)";
    }
    public void MathOperations(){
        System.out.println("Input a b: ");
        float a = input.InputFloat();
        float b = input.InputFloat();
        float sum = a+b;
        float rozn = a-b;
        float ilocz = a*b;
        System.out.println("a + b = " + sum + ", a - b =" + rozn + ", a * b = " + ilocz);
    }
    public boolean parzNieparz(){
        System.out.println("Input a: ");
        float a = input.InputFloat();
        if (a % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean podziel(){
        System.out.println("Input a: ");
        float a = input.InputFloat();
        if ((a % 3 == 0) && (a % 5 == 0)){
            return true;
        }
        else{
            return false;
        }
    }
    public void potega(){
        System.out.println("Input a: ");
        float a = input.InputFloat();
        System.out.println(a*a*a);
    }
    public void perwiastek(){
        System.out.println("Input a: ");
        float a = input.InputFloat();
        double result = Math.sqrt(a);
        System.out.println(result);
    }
    public boolean trojkat(){
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


}

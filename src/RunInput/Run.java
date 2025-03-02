package RunInput;

import Task.Tasks;

public class Run {

    public void RunTask(){
        //obiekt klas
        Tasks tasks = new Tasks();
        Input input = new Input();

        System.out.println("Laboratorium 1\n");
        System.out.println("Zadanie 1");
        System.out.println("Zadanie 2");
        System.out.println("Zadanie 3");
        System.out.println("Zadanie 4");
        System.out.println("Zadanie 5");
        System.out.println("Zadanie 6");
        System.out.println("Zadanie 7");
        System.out.println("Wybierz zadanie:");

        int wybor = input.InputInt();
        switch (wybor){
            case 1:
                System.out.println(tasks.DataUser()); break;
            // kolejne case ....
            case 2:
                tasks.MathOperations(); break;
            case 3:
                System.out.println(tasks.parzNieparz()); break;
            case 4:
                System.out.println(tasks.podziel()); break;
            case 5:
                tasks.potega(); break;
            case 6:
                tasks.perwiastek(); break;
            case 7:
                System.out.println(tasks.trojkat()); break;
            default: System.out.println("Nie ma takiego zadania");

        }
    }

}

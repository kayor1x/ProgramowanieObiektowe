package RunInput;

import Task.Tasks;

public class Run {

    public void RunTask(){
        //obiekt klas
        Tasks tasks = new Tasks();
        Input input = new Input();
        char selection;
        while(true) {
            System.out.println("WYJDŻ wpisując 'Q' 'q' albo cokolwiek innego żeby KONTYNUOWAĆ");
            selection = input.InputChar();
            if(selection == 'q' || selection == 'Q')
                break;
            System.out.println("1");
            System.out.println("2");
            System.out.println("Wybierz numer labu:");
            int wyborLab = input.InputInt();
            switch (wyborLab) {
                case 1: {
                    System.out.println("Zadanie 1");
                    System.out.println("Zadanie 2");
                    System.out.println("Zadanie 3");
                    System.out.println("Zadanie 4");
                    System.out.println("Zadanie 5");
                    System.out.println("Zadanie 6");
                    System.out.println("Zadanie 7");
                    System.out.println("Wybierz numer zadania labu:");
                    int wyborZad = input.InputInt();
                    switch (wyborZad) {
                        case 1:
                            System.out.println(tasks.DataUser());
                            break;
                        case 2:
                            tasks.MathOperations();
                            break;
                        case 3:
                            System.out.println(tasks.parzNieparz());
                            break;
                        case 4:
                            System.out.println(tasks.podziel());
                            break;
                        case 5:
                            tasks.potega();
                            break;
                        case 6:
                            tasks.perwiastek();
                            break;
                        case 7:
                            System.out.println(tasks.trojkat());
                            break;
                        default:
                            System.out.println("Nie ma takiego zadania");
                            break;
                    }
                }
                break;
                case 2: {
                    System.out.println("Zadanie 1");
                    System.out.println("Zadanie 2");
                    System.out.println("Zadanie 3");
                    System.out.println("Zadanie 4");
                    System.out.println("Zadanie 5");
                    System.out.println("Zadanie 6");
                    System.out.println("Wybierz numer zadania labu:");
                    int wyborZad = input.InputInt();
                    switch (wyborZad) {
                        case 1:
                            tasks.rownanieKwad();
                            break;
                        case 2:
                            tasks.wartosc_f();
                            break;
                        case 3:
                            tasks.sortInputs();
                            break;
                        case 4:
                            tasks.weather();
                            break;
                        case 5:
                            tasks.buyCar();
                            break;
                        case 6:
                            tasks.calculator();
                            break;
                        default:
                            System.out.println("Nie ma takiego zadania");
                            break;
                    }
                    break;
                }
                default:
                    System.out.println("Nie ma takiego laba");
                    break;

            }
        }
    }
}
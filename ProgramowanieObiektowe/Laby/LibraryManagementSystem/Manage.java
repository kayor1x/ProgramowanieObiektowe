import java.io.Console;
import java.util.Scanner;
public class Manage {
    public static void main(String[] args) throws InvalidBookException, DuplicateBookException, BookNotFoundException {
// Inicjalizacja obiektów: biblioteki, BookInput
        Library lib = new Library();
        ConsoleBookInput cbi = new ConsoleBookInput();
// Pętla główna z menu
        int wybor;
        System.out.println("Witam w bibliotece!\nTu możesz:");
        while (true) {
            System.out.println("1. Dodać książke\n2. Usunąć książkę\n3. Edytować książki\n4. Wyświetlić wszystkie książki\n5. Znależć książkę za ISBN\n0. Wyjść z programu ");
            wybor = cbi.inputInteger();
            if(wybor == 0) {
                System.out.println("Wychodzenie z biblioteki...\nMiłego dnia!");
                break;
            }
            switch (wybor) {
                case 1:
                    lib.addBook(cbi.readBook());
                    break;
                case 2:
                    lib.removeBook(cbi.inputISBN());
                    break;
                case 3:
                    lib.editBook(cbi.inputISBN(), cbi.readBook());
                    break;
                case 4:
                    lib.listBooks();
                    break;
                case 5:
                    lib.findBook(cbi.inputISBN());
                    break;

                default:
                    System.out.println("Nie ma takiej funkcji ;(");
                    break;
            }
        }
// Obsługa opcji (dodawanie, usuwanie, edycja itd.) 
// Obsługa wyjątków (try-catch) 
    }
} 
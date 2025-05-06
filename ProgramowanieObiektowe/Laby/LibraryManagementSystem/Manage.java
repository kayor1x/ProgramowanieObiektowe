import java.io.Console;
import java.util.Scanner;
public class Manage {
    public static void main(String[] args) throws InvalidBookException, DuplicateBookException {
// Inicjalizacja obiektów: biblioteki, BookInput
        Library lib = new Library();
        ConsoleBookInput cbi = new ConsoleBookInput();
        lib.addBook(new Book("Criminal", "Jan", "0000"));
        lib.addBook(new Book("Comedy", "Nowak", "0001"));
        lib.addBook(new Book("Study", "Kowalski", "0002"));
        lib.addBook(cbi.readBook());
// Pętla główna z menu
        int wybor;
        while (true) {
            System.out.println("Witam w bibliotece!\nTu możesz:\n1. Dodać książke\n2. Usunąć książkę\n3. Edytować książki\n4. ");
            switch (wybor) {

                case 1:
                    break;
                case 2:
            }
        }
// Obsługa opcji (dodawanie, usuwanie, edycja itd.) 
// Obsługa wyjątków (try-catch) 
    }
} 
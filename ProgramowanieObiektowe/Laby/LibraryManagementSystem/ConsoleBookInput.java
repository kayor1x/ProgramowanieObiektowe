
import java.util.Scanner;

public class ConsoleBookInput implements BookInput {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Book readBook() throws InvalidBookException {
        // Wczytywanie danych z konsoli i tworzenie obiektu Book
        System.out.print("\nWpisz Title: ");
        String title = scanner.nextLine();
        System.out.print("Wpisz Author: ");
        String author = scanner.nextLine();
        System.out.print("Wpisz ISBN: ");
        String isbn = scanner.nextLine();
        return new Book(title, author, isbn);
    }

    public String inputISBN(){
        System.out.print("Wpisz ISBN: ");
        return scanner.nextLine();
    }
    public int inputInteger(){
        int value = scanner.nextInt();
        scanner.nextLine();  // czyści enter z bufora
        return value;
    }
}

import java.util.Scanner;

public class ConsoleBookInput implements BookInput {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Book readBook() throws InvalidBookException {
        // Wczytywanie danych z konsoli i tworzenie obiektu Book
        return new Book(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
    }
}
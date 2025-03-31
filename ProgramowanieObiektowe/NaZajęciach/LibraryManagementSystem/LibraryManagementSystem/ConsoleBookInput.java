package LibraryManagementSystem;
import java.util.Scanner;

public ConsoleBookInput implements BookInput {
    private Scanner scanner = new Scanner(System.in);
    public Book readBook() throws InvalidBookException {
        System.out.println("Wpisz authora: ");
        System.out.println("Wpisz titla: ");
        System.out.println("Wpisz ISBNa: ");
        return null;
    }
}
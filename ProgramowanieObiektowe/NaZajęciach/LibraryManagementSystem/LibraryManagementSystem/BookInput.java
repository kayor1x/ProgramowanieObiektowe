package LibraryManagementSystem;
public interface BookInput {
    // Metoda do pobierania danych książki od użytkownika
    public void readBook() throws InvalidBookException;
}
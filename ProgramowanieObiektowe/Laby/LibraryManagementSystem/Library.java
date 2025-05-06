import java.util.*;

public class Library {
    // Kolekcja książek (np. HashMap<String, Book> z kluczem ISBN)
    private Map<String, Book> books = new HashMap<>();

    // Dodawanie książki (CRUD - Create)
    public void addBook(Book book) throws DuplicateBookException {
        if(books.containsKey(book.getIsbn())) {
            throw new DuplicateBookException("Taka książka już istnieje");
        }
        books.put(book.getIsbn(), book);

    }
    // Usuwanie książki (CRUD - Delete)
    public void removeBook(String isbn) throws BookNotFoundException {
// usunięcie po ISBN
        if(!books.containsKey(isbn)) {
            throw new BookNotFoundException("Książki o ISBN: " + isbn + " - nie znaleziono");
        }
        books.remove(isbn);
    }
    // Edycja książki (CRUD - Update)
    public void editBook(String isbn, Book updatedBook) throws BookNotFoundException {
// aktualizacja danych
        if(!books.containsKey(isbn)) {
            throw new BookNotFoundException("Książki o ISBN: " + isbn + " - nie znaleziono");
        }
        books.replace(isbn, updatedBook);
    }
    // Lista książek (CRUD - Read)
    public void listBooks() {
// wypisanie wszystkich książek
        for(Map.Entry<String, Book> entry : books.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());

        }
    }
    // Wyszukiwanie książki po ISBN
    public void findBook(String isbn) throws BookNotFoundException {
    if(!books.containsKey(isbn)) {
        throw new BookNotFoundException("Książki o ISBN: " + isbn + " - nie znaleziono");
    }
    System.out.println(books.entrySet());
    }
}
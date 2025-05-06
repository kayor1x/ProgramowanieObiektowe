public class Book {
    // Pola: tytuł, autor, ISBN
    private String title;
    private String author;
    private String isbn;
    // Konstruktor z walidacją danych (rzuca wyjątek)
    public Book(String title, String author, String isbn) throws
            InvalidBookException {
        // ustawienie pól z walidacją
    }

    // Gettery i settery z walidacją
    public String getTitle() { return title; }
    public void setTitle(String title) throws InvalidBookException {
       if (title == null || title.trim().equals("")) {
           throw new InvalidBookException("Title is empty");
       }
       this.title = title;
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) throws InvalidBookException {
        if (author == null || author.trim().equals("")) {
            throw new InvalidBookException("Author is empty");
        }
        this.author = author;
    }

    public String getIsbn() {return isbn; }
    public void setIsbn(String isbn) throws InvalidBookException {
        if (isbn == null || isbn.trim().equals("")) {
            throw new InvalidBookException("Isbn is empty");
        }
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
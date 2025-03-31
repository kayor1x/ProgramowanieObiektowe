//package LibraryManagementSystem;
//
//public class Book {
//    // Pola: tytuł, autor, ISBN
//    private String title;
//    private String author;
//    private String isbn;
//
//    // Konstruktor z walidacją danych (rzuca wyjątek)
//    public Book() {
//        this.title = "Untitled";
//        this.author = "Unnamed";
//        this.isbn = "Missing";
//    }
//
//    public Book(String title, String author, String isbn) throws
//            InvalidBookException {
//        this.title = title;
//        this.author = author;
//        this.isbn = isbn;
//    }
//
//    // Gettery i settery z walidacją
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) throws InvalidBookException {
//        if (title != null)
//            this.title = title;
//        else
//            throws InvalidBookException;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) throws InvalidBookException {
//        this.author = author;
//    }
//
//    public String getIsbn() {
//        return isbn;
//    }
//
//    public void setIsbn(String isbn) throws InvalidBookException {
//        this.isbn = isbn;
//    }
//
//    public void toString() {
//        System.out.println("Title: " + this.title + "\nAuthor: " + this.author + "\nISBN: " + this.isbn);
//    }
//}
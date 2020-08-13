/**
 * @author : sayantan
 * 
 * This is the datamodel for a Book
 */

public class Book {
    public final String bookTitle;
    public final String author;
    public final String isbn;
    public final String publisher;
    public final Language language;
    public final Integer publishedYear;
    public final Binding binding;
    public final Double price;

    public Book(String bookTitle, String author, String isbn, String publisher, Language language, Integer publishedYear, Binding binding, Double price) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.language = language;
        this.publishedYear = publishedYear;
        this.binding = binding;
        this.price = price;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public Language getLanguage() {
        return language;
    }

    public Integer getPublishedYear() {
        return publishedYear;
    }

    public Binding getBinding() {
        return binding;
    }

    public Double getPrice() {
        return price;
    }
}
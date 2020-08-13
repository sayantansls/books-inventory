import java.util.List;
import java.util.ArrayList;

/**
 * @author : sayantan
 * 
 * Testing the methods
 */

public class Test {
    public static void main(String args[]) {
        FindBooks findBooks = new FindBooksImpl();
        List<Book> allBooks = new ArrayList<>();
        Book book1 = new Book("Harry Potter 1", "JK Rowling", "ISBN123", "Penguin Books", Language.ENGLISH, 2017, Binding.PAPERBACK, 150.5);
        Book book2 = new Book("Alchemist", "Paulo Coehlo", "ISBN123", "Altoid Books", Language.ENGLISH, 2017, Binding.PAPERBACK, 450.96);
        Book book3 = new Book("Harry Potter 2", "JK Rowling", "ISBN123", "Penguin Books", Language.ENGLISH, 2019, Binding.HARDBOUND, 254.14);
        allBooks.add(book1);
        allBooks.add(book2);
        allBooks.add(book3);
        Book bookByTitle = findBooks.findBookByTitle("Alchemist", allBooks);
        System.out.println(String.format("Book By Title : %s", bookByTitle.bookTitle));
    }
}
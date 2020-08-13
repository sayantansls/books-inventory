import java.util.Collection;
import java.util.Set;

/**
 * @author : sayantan
 * 
 * This is the interface which contains the methods for purchasing the books
 */

 public interface FindBooks {
    /**
     * Returns a Book object based on book title
     * @param bookTitle String matching the title of the book
     * @return Book object
     */
    public Book findBookByTitle(String bookTitle, Collection<Book> allBooks);
     
    /**
     * Returns a list of Books based on author name
     * @param author String matching the author of the book
     * @return list of Book objects
     */
    public Set<Book> findBooksByAuthor(String author, Collection<Book> allBooks);

    /**
     * Returns a list of Books within the price range
     * @param startingPrice the starting price range of book 
     * @param endingPrice the ending price range of book
     * @return list of Book objects
     */
    public Set<Book> findBooksByPriceRange(Integer startingPrice, Integer endingPrice, Collection<Book> allBooks);

    /**
     * Returns a list of Books based on publisher
     * @param publisher String matching the publisher of the book
     * @return list of Book objects
     */
    public Set<Book> findBooksByPublisher(String publisher, Collection<Book> allBooks);

    /**
     * Returns a list of books based on published year
     * @param publishedYear Integer matching the published year of the book
     * @return list of Book objects
     */
    public Set<Book> findBooksByPublishedYear(Integer publishedYear, Collection<Book> allBooks);

    /**
     * Returns a list of books based on language
     * @param language matching the language of the book
     * @return list of Book objects
     */
    public Set<Book> findBooksByLanguage(Language language, Collection<Book> allBooks);

    /**
     * Returns a list of books based on binding
     * @param binding matching the binding of the book
     * @return list of Book objects
     */
    public Set<Book> findBooksByBinding(Binding binding, Collection<Book> allBooks);
 }
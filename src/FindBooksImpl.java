import java.util.Collection;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

/**
 * @author : sayantan
 * 
 * Implements the interface {@link FindBooks}
 */

public class FindBooksImpl implements FindBooks {
    public Book findBookByTitle(String bookTitle, Collection<Book> allBooks) {
        Book bookOfInterest = null;
        for(Book book : allBooks) {
            if(book.bookTitle.equals(bookTitle)) {
                bookOfInterest = book;
            }
        }
        return bookOfInterest;
    }

    public Set<Book> findBooksByAuthor(String author, Collection<Book> allBooks) {
        Set<Book> booksOfInterest = new HashSet<>();
        for(Book book : allBooks) {
            if(book.author.equals(author)) {
                booksOfInterest.add(book);
            }
        }
        return booksOfInterest;
    }

    public Set<Book> findBooksByPriceRange(Integer startingPrice, Integer endingPrice, Collection<Book> allBooks) {
        Set<Book> booksOfInterest = new HashSet<>();
        for(Book book : allBooks) {
            if(book.price >= startingPrice && book.price <= endingPrice) {
                booksOfInterest.add(book);
            }
        }
        return booksOfInterest;
    }

    public Set<Book> findBooksByPublisher(String publisher, Collection<Book> allBooks) {
        Set<Book> booksOfInterest = new HashSet<>();
        for(Book book : allBooks) {
            if(book.publisher.equals(publisher)) {
                booksOfInterest.add(book);
            }
        }
        return booksOfInterest;
    }

    public Set<Book> findBooksByPublishedYear(Integer publishedYear, Collection<Book> allBooks) {
        Set<Book> booksOfInterest = new HashSet<>();
        for(Book book : allBooks) {
            if(book.publishedYear.equals(publishedYear)) {
                booksOfInterest.add(book);
            }
        }
        return booksOfInterest;
    }

    public Set<Book> findBooksByLanguage(Language language, Collection<Book> allBooks) {
        Set<Book> booksOfInterest = new HashSet<>();
        for(Book book : allBooks) {
            if(book.language.equals(language)) {
                booksOfInterest.add(book);
            }
        }
        return booksOfInterest;
    }

    public Set<Book> findBooksByBinding(Binding binding, Collection<Book> allBooks) {
        Set<Book> booksOfInterest = new HashSet<>();
        for(Book book : allBooks) {
            if(book.binding.equals(binding)) {
                booksOfInterest.add(book);
            }
        }
        return booksOfInterest;
    }
}
package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.repositories.BookRepository;
import org.springframework.stereotype.Service;

/**
 * Created by Amurita
 * On Mo., the 08. of Apr 2024
 * At 09:57 o'clock
 */

@Service
public class BookServiceImpl implements BookService {

    /*
    * Book repository property (private final).
    * */
    private final BookRepository bookRepository;

    /*
    * Contructor for initializing the book repository.
    * */
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     * Method to get all found books.
     * @return an Iterable<Book> of Book objects found through the implemented method.
     */
    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}

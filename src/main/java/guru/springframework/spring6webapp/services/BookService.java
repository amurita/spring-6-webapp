package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Book;

/**
 * Created by Amurita
 * On Monday, the 08. of April 2024
 * At 09:41 o'clock
 */
public interface BookService {

    /**
     * Method to get all found books.
     * @return an Iterable of Book objects found via the method.
     */
    Iterable<Book> findAll();
}

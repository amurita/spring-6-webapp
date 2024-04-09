package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Author;

/**
 * Created by Amurita
 * On Tuesday, the 09. of April 2024
 * At 08:49 o'clock
 */
public interface AuthorService {

    /**
     * Method to get all found authors.
     * @return an Iterable of Author objects found via the method.
     */
    Iterable<Author> findAll();
}

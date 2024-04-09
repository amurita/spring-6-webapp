package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

/**
 * Created by Amurita
 * On Tuesday, the 09. of Apr 2024
 * At 08:52 o'clock
 */

@Service
public class AuthorServiceImpl implements AuthorService {

    /*
    * Author repository property (private final).
    * */
    private final AuthorRepository authorRepository;

    /*
    * Contructor for initializing the author repository.
    * */
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    /**
     * Method to get all found authors.
     * @return an Iterable<Author> of Author objects found through the implemented method.
     */
    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}

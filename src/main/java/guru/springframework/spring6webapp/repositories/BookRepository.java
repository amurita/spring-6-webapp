package guru.springframework.spring6webapp.repositories;

import guru.springframework.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Amurita
 * On Mittwoch, the 03. of April, 2024
 * At 09:56 o'clock
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}

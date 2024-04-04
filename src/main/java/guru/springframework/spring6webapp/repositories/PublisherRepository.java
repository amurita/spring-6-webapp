package guru.springframework.spring6webapp.repositories;

import guru.springframework.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Amurita
 * On Thursday, the 04. of April 2024
 * At 11:35 o'clock
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

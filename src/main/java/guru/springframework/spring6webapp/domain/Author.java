package guru.springframework.spring6webapp.domain;

/**
 * Dependencies
 */
import jakarta.persistence.*;

import java.util.Set;

/**
 * Created by Amurita
 * On Donnerstag, the 28. of März, 2024
 * At 10:55 o'clock
 */
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    /*
    * Following the part for the entity relationship of author and book.
    * */
    @ManyToMany(mappedBy = "authors") // Take care of the JPA mapping.
                                      // This is going to be mapped by
                                      // the authors property of the books.
    private Set<Book> books;

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    /**
     * Getter for the ID value
     * @return the ID value for the Author Entity
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter for the ID value
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for the first name
     * @return the first name String for the Author Entity
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for the last name
     * @return the last name String for the Author Entity
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

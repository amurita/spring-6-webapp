package guru.springframework.spring6webapp.domain;

/**
 * Dependencies
 */
import jakarta.persistence.*;

import java.util.HashSet;
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
    private Set<Book> books = new HashSet<>();

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

    /*
    * Following the toString method, to display all property names and its
    * values.
    * */
    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", books=" + books +
                '}';
    }

    /*
    * Following the "equals" and "hashCode" methods, so that Hibernate is
    * able to determine object equity.
    * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author author)) return false;

        return getId() != null ? getId().equals(author.getId()) : author.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}

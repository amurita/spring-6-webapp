package guru.springframework.spring6webapp.domain;

import jakarta.persistence.*;

import java.util.Set;

/**
 * Created by Amurita
 * On Donnerstag, the 28. of März, 2024
 * At 10:55 o'clock
 */

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String isbn;

    /*
     * Following the part for the entity relationship of author and book.
     * */
    @ManyToMany
    @JoinTable(name = "author_book",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors;

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    /**
     * Getter for the ID value
     * @return the ID value for the Book Entity
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
     * Getter for the title of the book
     * @return the title for the Book Entity
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter for the title of the book
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for the ISBN
     * @return the ISBN for the Book Entity
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Setter for the ISBN of the book
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}

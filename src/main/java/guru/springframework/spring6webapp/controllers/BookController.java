package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Amurita
 * On Monday, the 08. of April 2024
 * At 10:34 o'clock
 */

@Controller
public class BookController {

    /*
    * Book service property (private final).
    * */
    private final BookService bookService;

    /*
    * Constructor for initializing the book service.
    * */
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {

        model.addAttribute("books", bookService.findAll());

        return "books";
    }
}

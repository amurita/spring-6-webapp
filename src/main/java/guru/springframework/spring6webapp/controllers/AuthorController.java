package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.services.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Amurita
 * On Tuesday, the 09. of April 2024
 * At 8:57 o'clock
 */

@Controller
public class AuthorController {

    /*
    * Author service property (private final).
    * */
    private final AuthorService authorService;

    /*
    * Constructor for initializing the author service.
    * */
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {

        model.addAttribute("authors", authorService.findAll());

        return "authors";
    }
}

package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class AppController {

    @Autowired
    private Facade facade;

    @RequestMapping("/look")
    public String look(ModelMap model) {
        System.out.print("In library");
        final List<Book> infoforjsp = facade.getBooks();
        model.addAttribute("info", infoforjsp);
        return "library";
    }

    @RequestMapping("/books/add")
    public String test2 (@RequestParam String name, @RequestParam String author,@RequestParam Integer pages,@RequestParam Double rating, ModelMap model){
        Book book = new Book(author, name, pages, rating);
        facade.getBooks().add(book);
        final List<Book> infoforjsp = facade.getBooks();
        model.addAttribute("info", infoforjsp);
        return "library";
    }
}

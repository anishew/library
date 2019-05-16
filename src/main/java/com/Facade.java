package com;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Facade {
    private List<Book> books = new ArrayList<>();
    public Facade() {
        for (int i=0; i<5; i++) {
            String author = i + "A";
            String name = "N" + i;
            Integer pages = i;
            Double rating = (double) i;
            Book book = new Book(author, name, pages, rating);
            books.add(book);
        }
        String bookss = books.stream().map(Object::toString).collect(Collectors.joining(", "));
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getMessage() {
        String bookss = books.stream().map(Object::toString).collect(Collectors.joining(", "));
        return bookss;
    }
}

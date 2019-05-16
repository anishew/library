package com;

public class Book {
    public String author;
    public String name;
    public Integer pages;
    public Double rating;

    public Double getRating() { return rating; }

    public void setRating(Double rating) { this.rating = rating; }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                ", rating=" + rating +
                '}';
    }

    public Book(String author, String name, Integer pages, Double rating) {
        this.author = author;
        this.name = name;
        this.pages = pages;
        this.rating = rating;
    }
    public Book() {

    }
}

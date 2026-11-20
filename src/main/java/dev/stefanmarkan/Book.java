package dev.stefanmarkan;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = this.isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return String.format("""
                Title: %s
                Author: %s
                
                ISBN: %s
                """,
                getTitle(),
                getAuthor(),
                getIsbn());
    }
}

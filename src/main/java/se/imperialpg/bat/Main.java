package se.imperialpg.bat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dev.stefanmarkan.Book;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        List<Book> availableBooks = new ArrayList<>(List.of(
                new Book("The Hobbit", "J.R.R. Tolkien", "9780547928227"),
                new Book("Dune", "Frank Herbert", "9780441172719"),
                new Book("1984", "George Orwell", "9780451524935"),
                new Book("Pride and Prejudice", "Jane Austen", "9780141439518")));

        Collections.shuffle(availableBooks);
        books.addAll(availableBooks.subList(0, 3));

        books.forEach(System.out::println);
    }
}

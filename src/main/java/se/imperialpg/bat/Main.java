package se.imperialpg.bat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import dev.stefanmarkan.Book;
import dev.stefanmarkan.Rating;

/**
 * Entry point for the book rating demonstration.
 * <p>
 * Creates a collection of books, assigns randomized ratings to each book,
 * shuffles the collection, and prints the books and their average ratings.
 * </p>
 */
public class Main {
    /**
     * Runs the book rating demonstration.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(List.of(
                new Book("The Hobbit", "J.R.R. Tolkien", "9780547928227"),
                new Book("Dune", "Frank Herbert", "9780441172719"),
                new Book("1984", "George Orwell", "9780451524935"),
                new Book("Pride and Prejudice", "Jane Austen", "9780141439518")));

        Collections.shuffle(books);

        Random random = new Random();
        for (Book book : books) {
            for (int i = 1; i <= 21; i++) {
                int score = random.nextInt(1, 11);
                book.AddRating(new Rating("Reader " + i, "reader" + i + "@example.com", score));
            }
        }

        books.forEach(System.out::println);
    }
}

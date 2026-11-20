package dev.stefanmarkan;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private List<Rating> ratingList;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        ratingList = new ArrayList<Rating>();
    }

    public void AddRating(Rating r) {
        if (!listHasEmail(r.email())) {
            ratingList.add(r);
        } else {
            System.out.println("Email already exists!");
        }
    }

    private boolean listHasEmail(String email) {
        for (Rating r : ratingList) {
            if (r.email().equalsIgnoreCase(email))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("""
                Title: %s
                Author: %s

                ISBN: %s
                Avarage rating: %.2f
                """,
                getTitle(),
                getAuthor(),
                getIsbn(),
                getAvarageRating());

    }

    public double getAvarageRating() {
        int total = 0;
        for (Rating r : ratingList) {
            total += r.score();
        }
        return total / ratingList.size();

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
}

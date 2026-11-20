package dev.stefanmarkan;

public record Book(String title, String author, String isbn) {

    @Override
    public String toString() {
        return String.format("""
                Title: %s
                Author: %s

                ISBN: %s
                """,
                title(),
                author(),
                isbn());
    }
}

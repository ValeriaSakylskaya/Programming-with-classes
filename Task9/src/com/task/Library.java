package com.task;


public class Library {
    private Book[] books;

    public Library() {
        books = new Book[5];
        books[0] = new Book(1, "Harry Potter", "Roulling", "rocmen", 1994, 369, 520.00, "normal");
        books[1] = new Book(2, "Caga", "Smit", "rocmen", 1923, 150, 560.00, "normal");
        books[2] = new Book(3, "paper", "Nate", "rocmen", 1934, 272, 720.40, "normal");
        books[3] = new Book(4, "Harry Potter 2", "Roulling", "cosmo", 1995, 400, 398.00, "normal");
        books[4] = new Book(5, "Harry Potter 3", "Roulling", "cosmo", 1997, 235, 422.00, "normal");
    }

    public String getBooksNamesByAuthor(String author) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equalsIgnoreCase(author))
                builder.append("" + books[i].toString() + "\n");
        }
        return builder.toString();
    }

    public String getPublishedBooksByPublisher(String publisher) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPublisher().equalsIgnoreCase(publisher))
                builder.append("" + books[i].getName() + "\n");
        }
        return builder.toString();
    }

    public String getPublishedBooksAfterYear(int year) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getYearPublishing() > year)
                builder.append("" + books[i].getName() + "\n");
        }
        return builder.toString();
    }
}

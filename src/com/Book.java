package com;

public class Book {
    String title;
    Author author;
    int year;
    int rating;
    String text;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        rating = 4;
        text = "";
    }

    public void up() {
        if (rating < 5) {
            rating++;
        }
    }

    public void down() {
        if (rating > 0) {
            rating--;
        }
    }

    public void append(String moreText) {
        if (text.isEmpty()) {
            text += moreText;
        } else {
            text += " " + moreText;
        }
    }
}

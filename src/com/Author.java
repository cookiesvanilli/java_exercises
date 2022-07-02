package com;

import java.time.LocalDate;

public class Author {
    String nameAuthor;
    String surnameAuthor;
    int numbOfBooks; //26

    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
        numbOfBooks = 0;
    }


    public Book newBook(String title) {
        numbOfBooks++;
        return  new Book(title, this, LocalDate.now().getYear());
    }
}

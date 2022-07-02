package com;

public class Main {
    public static void main(String[] args) {
        Author infoAuthor = new Author("Herbert", "Schildt");
        Book infoBook = new Book("Java: The Complete Reference", infoAuthor, 2019);
        System.out.println(infoBook.title + "," + infoBook.author.nameAuthor + " " + infoBook.author.surnameAuthor + "," + infoBook.year + "," + infoBook.rating + "," + infoBook.text);
        infoBook.down();
        System.out.println(infoBook.rating);

        infoBook.up();
        System.out.println(infoBook.rating);

        infoBook.append("Java");
        infoBook.append("Eleventh Edition");
        System.out.println(infoBook.text);

        Book newBook = infoAuthor.newBook("C++: The Complete Reference");
        System.out.println(newBook.title + " " + newBook.author.nameAuthor + " " + newBook.author.surnameAuthor + " " + newBook.author.numbOfBooks);

        infoAuthor.newBook("C++ Programming Cookbook");
        System.out.println("Count of books: " + infoAuthor.numbOfBooks);
    }
}

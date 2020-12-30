package com.company;

public class Shelf {
    private int numBooks = 0;
    private int id;
    private boolean isFull = false;
    private Book[] books = new Book[10];

    public Shelf(int identifier){
        this.id = identifier;
    }

    public void addBook(Book book){
        if(numBooks < books.length){
            books[numBooks] = book;
            numBooks++;
        }
        else{
            isFull = true;
        }
    }
}

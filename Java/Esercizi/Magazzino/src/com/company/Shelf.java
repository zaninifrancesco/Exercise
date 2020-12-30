package com.company;

public class Shelf {
    private int numBooks = 0;
    private int id;
    private boolean isFull = false;
    private Book[] books;

    public Shelf(int identifier, int nMax){
        this.id = identifier;
        books = new Book[nMax];
    }

    public void addBook(Book book){
        if(numBooks < books.length - 1){
            books[numBooks] = book;
            numBooks++;
        }
        else{
            isFull = true;
        }
    }

    public boolean isFull(){
        return isFull;
    }

    public int getNumBooks(){
        return numBooks;
    }

    public int getId() {
        return id;
    }

    public Book[] getBooks() {
        return books;
    }
}

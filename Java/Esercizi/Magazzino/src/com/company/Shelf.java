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
        if(numBooks < books.length){
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

    public void sortBooks(){
        for(int i = 0; i < numBooks; i++){
            for(int j = 0; j < numBooks; j++){
                if(books[i].getNumPages() > books[j].getNumPages()){
                    int pages1, pages2;
                    String title1, genres1, title2, genres2;            //VARIABILI DI APPOGGIO PER FARE IL SELECTION SORT

                    pages1 = books[i].getNumPages();
                    pages2 = books[j].getNumPages();
                    title1 = books[i].getTitle();
                    title2 = books[j].getTitle();
                    genres1 = books[i].getGenre();
                    genres2 = books[j].getGenre();

                    books[i].setNumPages(pages2);
                    books[j].setNumPages(pages1);
                    books[i].setTitle(title2);
                    books[j].setTitle(title1);
                    books[i].setGenre(genres2);
                    books[j].setGenre(genres1);

                }
            }
        }

    }
}

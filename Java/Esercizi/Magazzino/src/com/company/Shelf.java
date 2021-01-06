/*
Classe Shelf.
In questa classe è contenuto l'array di oggetti books di tipo Book
L'array di oggetti viene inizializzato nel costruttore con dimensiome max data come parametro
E' possibile aggiungere un libro finchè c'è spazio, ordinare i libri in base alle pagine
 */


package com.company;

public class Shelf {
    private int numBooks = 0;
    private int id;
    private boolean isFull = false;
    private Book[] books;           //Dichiarazione array di oggetti di tipo Book

    public Shelf(int identifier, int nMax){
        this.id = identifier;
        books = new Book[nMax];     //inizializzazione dell'array con dimensione nMax
    }

    public void addBook(Book book){
        if(numBooks < books.length){
            books[numBooks] = book;     //controlla se c'è abbastanza spazio per inserire un nuovo oggetto libro e controlla se è pieno
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

    public void sortBooks(){                                //Algoritmo di sort Selection Sort
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

    public void showInfo(){
        if(numBooks != 0){
            for(int i = 0; i < numBooks; i++){
                System.out.println(books[i].showInfo());
            }
        }
        else{
            System.out.println("Shelf's empty");
        }
    }

    public void search(String title){
        int i = 0;
        boolean hasBeenFound = false;
        while(!hasBeenFound || i <= numBooks){
            if(books[i].getTitle().equals(title)){      //Algoritmo per cercare un elemento in base al titolo dato come
                                                        //parametro della funzione
                hasBeenFound = true;
            }
            else{
                i++;
            }
        }
        System.out.println(books[i].showInfo());
    }
}

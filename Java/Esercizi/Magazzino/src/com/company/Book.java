package com.company;

public class Book {
    private int numPages;
    private String title;
    private String genre;

    public Book(int nPages, String bookTitle, String bookGenre){
        this.genre = bookGenre;
        this.numPages = nPages;
        this.title = bookTitle;
    }

    public int getNumPages() {
        return numPages;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String showInfo(){
        return "Book title: " + this.title + "\nBook pages: " + this.numPages + "\nBook genre: " + this.genre;
    }
}

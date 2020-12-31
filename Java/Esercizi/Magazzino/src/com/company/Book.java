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

    public void setNumPages(int num){
        this.numPages = num;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

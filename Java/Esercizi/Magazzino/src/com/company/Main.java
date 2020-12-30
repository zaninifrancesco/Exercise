package com.company;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Shelf shelf = new Shelf(100, 3); //Istanza della classe scaffale

        int r;

        System.out.println(shelf.getBooks().length);

        do{
            System.out.println("1. Add books to the shelf\n" +
                    "2. Show how many books are in the shelf\n" +
                    "3. Show a specified books info\n" +
                    "4. Sort the shelf\n" +
                    "5. Show every books info\n" +
                    "6. Exit");
            r = scan.nextInt();

            switch (r){
                case 1:
                    if(!shelf.isFull()){
                        System.out.print("Book title: ");
                        String bookTitle = scan.next();
                        System.out.print("Book pages: ");
                        int bookPages = scan.nextInt();
                        System.out.print("Book genre: ");
                        String bookGenre = scan.next();

                        shelf.addBook(new Book(bookPages, bookTitle, bookGenre));

                        System.out.println("Book successfully added");
                    }
                    else{
                        System.out.println("Shelf is full");
                    }
                    break;
                case 2:
                    System.out.println("There are " + shelf.getNumBooks() + " books in the shelf");
                    break;
                case 3:
                    System.out.print("Enter the title of book which you want to see the info: ");
                    int page = scan.nextInt();
                    //TODO: ARRAY SEARCHING ALGORITHM
                    break;
                case 4:
                    //TODO: ARRAY SORTING ALGORITHM
                case 5:
                    if(shelf.getNumBooks() != 0) {
                        for (int i = 0; i < shelf.getNumBooks(); i++) {
                            System.out.println(shelf.getBooks()[i].showInfo());
                        }
                    }
                    else {
                        System.out.println("Shelf's empty");
                    }
            }
        }while ( r != 6);
    }
}

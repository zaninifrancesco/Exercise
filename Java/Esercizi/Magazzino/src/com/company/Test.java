/*
CLASSE TEST,
Questo programma consente di andare ad operare su uno scaffale con una selezione multipla aggiungendo libri
e vedendone le informazioni principali come:
- il numero delle pagine
- il titolo
- il genere del libro
Consente inoltre di vedere le informazioni di tutti i libri o di un singolo libro
e di ordinarli per numero di pagine attraverso un algoritmo di sorting
 */

package com.company;
import java.util.Scanner;

public class Test {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Shelf shelf = new Shelf(100, 3); //Istanza della classe scaffale
        int r;

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
                    String title = scan.next();
                    shelf.search(title);
                    break;
                case 4:
                    shelf.sortBooks();
                    System.out.println("Shelf successfully sorted!");
                    break;
                case 5:
                    shelf.showInfo();
                    break;
            }
        }while ( r != 6);
    }
}

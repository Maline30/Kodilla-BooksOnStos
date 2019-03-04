package com.kodilla.booksonstos;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

class Book{
    String title;
    String author;
    int year;

    // constructor with arguments
    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // toString method used for printout the object
    public String toString(){
        return "Title: \"" + title + "\", author: " + author + ", (" + year + ")";
    }

    // getters
    public String  getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }
}

class Stos{

    public static void main(String[] args) throws Exception{

        //Create a books
        Book theBook1 = new Book("Czysty kod","Robert C Martin", 2014);
        Book theBook2 = new Book("Metro 2033","Dmitry Glukhovsky", 2015);
        Book theBook3 = new Book("Władca Pierścieni", "Tolkien John Ronald Reuel", 1955);
        Book theBook4 = new Book("Harry Potter i kamień Filozoficzny", "J.K. Rowling", 1997);
        Book theBook5 = new Book("Kod Leonarda da Vinci",  "Brown Dan", 2003);
        Book theBook6 = new Book("Buszujący w zbożu", "Salinger J. D.", 1951);
        Book theBook7 = new Book("Anioły i demony", "Simonetti Francesco", 2000);

        //Create the Lifo (Stos) queue
        ArrayDeque<Book> theBooks = new ArrayDeque<Book>();

        //check size of the queue
        System.out.println("Queue is created. It's size: " + theBooks.size());
        System.out.println("-------------------------------------");

        //Push the book into the queue
        theBooks.push(theBook1);
        theBooks.push(theBook2);
        theBooks.push(theBook3);
        theBooks.push(theBook4);
        theBooks.push(theBook5);
        theBooks.push(theBook6);
        theBooks.push(theBook7);

        //check size of the queue
        System.out.println("Queue is filled. it's size: " + theBooks.size());
        System.out.println("-------------------------------------");

        //Gets objects and delete elements
        Book temporaryBook;
        temporaryBook = theBooks.pop();

        while (theBooks.size() > 0) {
            temporaryBook = theBooks.pop();
        }
        //Check size of the queue
        System.out.println("Queue is emptied. It's size: " + theBooks.size());
        System.out.println("-------------------------------------");
        // Check what was taken as last
        System.out.println("Last order taken from queue was:\n" + temporaryBook);
        System.out.println("------------------------------------------------------");

    }
}
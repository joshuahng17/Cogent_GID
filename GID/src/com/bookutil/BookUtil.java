package com.bookutil;

import java.util.Scanner;

import com.book.*;

public class BookUtil {

	public static void main(String[] args) {
		
		BookStore bs = new BookStore();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 3 books");
		int bookCount = 0; //Counter for holding the number of created books
		while(bookCount < 3) { //Will not exit loop until three books are successfully created
			try { //Catches exceptions if the book parameters are invalid
				System.out.println("Enter the Book ID");
				String id = sc.next();
				sc.nextLine(); //Used to reset the scanner position
				System.out.println("Enter the Book Title");
				String title = sc.nextLine();
				System.out.println("Enter the Book Author");
				String author = sc.nextLine();
				System.out.println("Enter the Book Category");
				String cat = sc.next();
				System.out.println("Enter the Book Price");
				float price = sc.nextFloat();
				Book b = new Book(id, title, author, cat, price);
				bs.addBook(b);
				bookCount++; //Only increments when books are successfully created and added to bookstore
				System.out.println("Book Added");
			} catch (InvalidBookException e) { //Enters the catch block when book construction fails
				System.out.println(e.getMessage());
				System.out.println("Please start over");
				continue; //Repeats at the beginning of the current book creation
			}
		}
		System.out.println("Searching by Title...");
		bs.searchByTitle("Harry Potter");
		System.out.println("Searching by Author...");
		bs.searchByAuthor("David Flanagan");
		System.out.println("Displaying all Books...");
		bs.displayAll();
	}
	
}

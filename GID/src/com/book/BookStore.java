package com.book;

import java.util.HashSet;
import java.util.Iterator;

public class BookStore {

	HashSet<Book> bookshelf;
	
	public BookStore() {
		bookshelf = new HashSet<Book>();
	}
	
	//Adds a book to the bookshelf
	public void addBook(Book b) {
		bookshelf.add(b);
	}
	
	//Returns the details of a book based on title
	public void searchByTitle(String title) {
		Iterator<Book> itr = bookshelf.iterator();
		//Iterates through the set until a matching title is found
		while(itr.hasNext()) {
			Book currentBook = itr.next();
			if(currentBook.title.equals(title)) {
				System.out.println("Book ID: "+currentBook.bookID);
				System.out.println("Book Title: "+currentBook.title);
				System.out.println("Book Author: "+currentBook.author);
				System.out.println("Book Category: "+currentBook.category);
				System.out.println("Book Price: "+currentBook.price);
				return;
			}
		}
		System.out.println("Book Not Found");
	}
	
	//Returns the details of a book based on author
	public void searchByAuthor(String author) {
		Iterator<Book> itr = bookshelf.iterator();
		//Iterates through the set until a matching author is found
		while(itr.hasNext()) {
			Book currentBook = itr.next();
			if(currentBook.author.equals(author)) {
				System.out.println("Book ID: "+currentBook.bookID);
				System.out.println("Book Title: "+currentBook.title);
				System.out.println("Book Author: "+currentBook.author);
				System.out.println("Book Category: "+currentBook.category);
				System.out.println("Book Price: "+currentBook.price);
				return;
			}
		}
		System.out.println("Book Not Found");
	}
	
	//Returns the details of every book
	public void displayAll() {
		Iterator<Book> itr = bookshelf.iterator();
		//Iterates through the entire set
		while(itr.hasNext()) {
			Book currentBook = itr.next();
			System.out.println("Book ID: "+currentBook.bookID);
			System.out.println("Book Title: "+currentBook.title);
			System.out.println("Book Author: "+currentBook.author);
			System.out.println("Book Category: "+currentBook.category);
			System.out.println("Book Price: "+currentBook.price);
		}
	}
}

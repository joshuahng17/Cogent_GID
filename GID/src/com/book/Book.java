package com.book;

public class Book {

	//default access: only bookstore can access them directly
	String bookID;
	String title;
	String author;
	String category;
	float price;
	
	public Book(String bookID, String title, String author, String category, float price) throws InvalidBookException {
		//Check if category contains the correct strings
		if(!(category.equals("Science") || category.equals("Fiction") || category.equals("Technology") || category.equals("Others")))
			throw new InvalidBookException("Error: Invalid Category");
		//Check if price is not negative
		if(price < 0)
			throw new InvalidBookException("Error: Price cannot be Negative");
		//Check if bookID is in the right format
		if(!(bookID.length() == 4 && bookID.charAt(0) == 'B'))
			throw new InvalidBookException("Error: Wrong BookID Format");
		
		//All check pass; Set class members
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
}

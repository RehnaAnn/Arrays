
/*
Create a Book class with the following attributes:
title
author
isbn (long)
price
isBorrowed
 one constructor that sets all attributes.
 follow the same drill : attributes will be private with public getters setters
 toString method to print all attribute values
 */

public class Book {
	//declaring the variables
	private String title;
	private String author;
	private long isbn;
	private float price;
	private boolean isBorrowed;
	//constructor
	public Book(String title, String author, long isbn, float price, boolean isBorrowed) {
		
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
		this.isBorrowed = isBorrowed;
	}
	//public getters and setters for the private attributes
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isBorrowed() {
		return isBorrowed;
	}

	public void setBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}
	//toString method to print all attribute values
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", price=" + price + ", isBorrowed="
				+ isBorrowed + "]";
	}
		

}

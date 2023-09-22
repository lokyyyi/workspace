package com.silsub1.book.model.vo;

public class Book {
	
	private String title;
	private String author;
	private int price;
	
	public Book() {	
	}
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public Book(Book book) {
		this.title = book.title;
		this.author = book.author;
		this.price = book.price;
	}

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "제목: " + title + "\n저자: " + author + "\n가격: " + price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof Book)) {
			return false;
		}
		Book book = (Book)obj;
		return title.equals(book.title) && author.equals(book.author) && price == book.price;
	}
	
	@Override
	public int hashCode() {
		return (title + author + price).hashCode();
	}

}

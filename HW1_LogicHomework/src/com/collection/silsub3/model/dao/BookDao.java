package com.collection.silsub3.model.dao;
import com.collection.silsub3.model.vo.Book;

import java.util.ArrayList;
import java.util.HashMap;

public class BookDao {

	private HashMap<String, Book> bookMap;
	
	public BookDao() {
		HashMap<String, Book> bookMap = new HashMap<>();
	}
	
	public BookDao(HashMap<String, Book> bookMap) {
		this.bookMap = bookMap;
	}
	
	public int getLastBookNo() {
		int val = 0;
		for(String key : bookMap.keySet()) {
			val = Integer.parseInt(key);
		}
		return val;
	}
	
	public void addBook(Book book) {
		bookMap.put(String.valueOf(book.getbNo()), book);
	}
	
	public Book deleteBook(String key) {
		bookMap.remove(bookMap.get(key));
		return bookMap.get(key);
	}
	
	public String searchBook(String title) {
		return null;
	}
	
	public Book selectBook(String key) {
		return null;
	}
	
	public HashMap<String, Book> selectAll(){
		return null;
	}
	
	public ArrayList<Book> sortedBookList(){
		return null;
	}
}

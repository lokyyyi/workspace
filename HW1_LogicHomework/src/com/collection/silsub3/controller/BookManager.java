package com.collection.silsub3.controller;

import java.util.HashMap;
import java.util.Scanner;

import com.collection.silsub3.model.dao.BookDao;
import com.collection.silsub3.model.vo.Book;

public class BookManager {

	BookDao bd = new BookDao();
	
	Scanner sc = new Scanner(System.in);
	
	public BookManager() {
	}
	
	public void addBook(Book book) {
		try {
			book.setbNo(bd.getLastBookNo()+1);
		} catch (IndexOutOfBoundsException e) {
			book.setbNo(1);
		} 
		bd.addBook(book);
	}
	
	public Book deleteBook(String key) {
		return bd.deleteBook(key);
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
	
	public Book[] sortedBookList() {
		return null;
	}
	
	public void printBookList(Book[] br) {

	}
}

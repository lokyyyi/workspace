package com.collection.silsub1.controller;

import java.util.Scanner;
import java.util.ArrayList;

import com.collection.silsub1.model.dao.BookDao;
import com.collection.silsub1.model.vo.Book;

public class BookManager {

	private BookDao bd = new BookDao();
	private Scanner sc = new Scanner(System.in);
	
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
	
	public int deleteBook(int no) {
		return bd.deleteBook(no);
	}
	
	public int searchBook(String title) {
		return bd.searchBook(title);
	}
	
	public Book selectBook(int index) {
		return bd.selectBook(index);
	}
	
	public ArrayList<Book> selectAll(){
		return bd.selectAll(); 
	}
	
	public Book[] sortedBookList() {
		ArrayList<Book> book1 = bd.sortedBookList();
		Book[] book = new Book[book1.size()];
		for(int i=0; i<book1.size(); i++) {
			book[i] = book1.get(i);
		}
		return book;
	}
	
	public void printBookList(Book[] br) {
		for(Book book : br) {
			System.out.println(book);
		}
	}
}

package com.collection.silsub1.model.dao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.collection.silsub1.model.comparator.AscCategory;
import com.collection.silsub1.model.vo.Book;

public class BookDao {

	private ArrayList<Book> bookList;
	
	public BookDao() {
		bookList = new ArrayList<Book>();
	}
	
	public BookDao(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}
	
	public int getLastBookNo() {
		return bookList.get(bookList.size()-1).getbNo();
	}
	
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	public int deleteBook(int no) {
		try {
			if(bookList.remove(no) != null) 
				return 0;
		}catch (IndexOutOfBoundsException e) {
		}
		return 1;
	}
	
	public int searchBook(String title) {
		int index = -1;
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(title)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public Book selectBook(int index) {
		return bookList.get(index);
	}
	
	public ArrayList<Book> selectAll(){
		return bookList;
	}
	
	public ArrayList<Book> sortedBookList(){
		Collections.sort(bookList, new AscCategory());
		
		return bookList;
	}
	
	
}

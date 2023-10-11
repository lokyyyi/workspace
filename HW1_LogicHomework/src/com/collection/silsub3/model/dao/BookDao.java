package com.collection.silsub3.model.dao;
import com.collection.silsub3.model.vo.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BookDao {

	private HashMap<String, Book> bookMap;
	private Map<String, Book> map;
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
		String result = "";
		Iterator<Entry<String, Book>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, Book> entry = it.next();
			if(entry.getValue().getTitle().equals(title)) {
				result = entry.getKey();
				break;
			}
		}
		return result;
	}
	
	public Book selectBook(String key) {
		return bookMap.get(key);
	}
	
	public HashMap<String, Book> selectAll(){
		return bookMap;
	}
	
	public ArrayList<Book> sortedBookList(){
		Set<Entry<String, Book>> entrySet =  bookMap.entrySet();
		List<Book> list = new ArrayList<>(entrySet);
			
		}
	}
}

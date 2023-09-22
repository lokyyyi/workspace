package com.inherit.test02;

public class Book {

	private String title;
	private String writer;
	private int price;
	
	public Book() {
	}
	
	public Book(String title, String writer, int price) {
		this.title = title;
		this.writer = writer;
		this.price = price;
	}

	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWriter() {
		return writer;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		
		//각 필드별로 비교
		//형변환
		Book other = (Book)obj;
		
		//비교
		if(this.title == null)	{
			if(other.title != null) {
				return false;
			}
		}else if(!title.equals(other.title)) {
			return false;
		
		}
		if(this.writer == null)	{
			if(other.writer != null) {
				return false;
			}
		}else if(!writer.equals(other.writer)) {
			return false;
		}
		
		if(price != other.price) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int hashCode() {
		return(title + writer + price).hashCode();
	}
	
	
}

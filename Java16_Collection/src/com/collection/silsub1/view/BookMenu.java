package com.collection.silsub1.view;

import java.util.Scanner;
import com.collection.silsub1.controller.BookManager;
import com.collection.silsub1.model.vo.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class BookMenu {

	Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	public BookMenu() {
	}
	
	public void mainMenu() {
		while(true) {
			System.out.println("*** 도서관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬 후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색 출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
			
			System.out.println("메뉴 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1:
				bm.addBook(inputBook());
				break;
			case 2:
				System.out.println(Arrays.toString(bm.sortedBookList()));
				break;
			case 3:
				System.out.println("삭제할 도서 번호를 입력하세요");
				int num1 = sc.nextInt();
				if(bm.deleteBook(num1-1) == 0) {
					System.out.println("성공적으로 삭제");
				}else 
					System.out.println("삭제할 글이 존재하지 않음");
				break;
			case 4:
				int result = bm.searchBook(inputBookTitle());
				System.out.println(bm.selectBook(result));
				break;
			case 5:
				ArrayList<Book> list = bm.selectAll();
				if(list.isEmpty()) {
					System.out.println("도서가 없습니다.");
				}else {
					Iterator<Book> it = list.iterator();
					while(it.hasNext()) {
						System.out.println(it.next());
					}
				}
				break;
			case 6: 
				System.out.println("프로그램을 종료합니다.");
				 return;
			}
			
		}
	}
	
	public Book inputBook() {
		System.out.print("도서제목 입력 : ");
		String title = sc.next();
		System.out.print("도서장르 입력 : ");
		int cat = sc.nextInt();
		System.out.print("도서저자 입력 : ");
		String author = sc.next();
		
		Book book = new Book(cat, title, author);
		
		return book;
	}
	
	public int inputBookNo() {
		System.out.print("도서번호 : ");
		int no = sc.nextInt();
		return no;
	}
	
	public String inputBookTitle() {
		System.out.print("도서제목 : ");
		String title = sc.next();
		return title;
	}
}

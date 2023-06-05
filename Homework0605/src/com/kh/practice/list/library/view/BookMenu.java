package com.kh.practice.list.library.view;

import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		System.out.println("===== Welcome KH Library =====");
		System.out.println("");
		System.out.println("=====***** 메인 메뉴 *****=====");
		System.out.println("1.새 도서 추가");
		System.out.println("2.도서 전체 조회");
		System.out.println("3.도서 검색 조회");
		System.out.println("4.도서 삭제");
		System.out.println("5.도서 명 오름차순 정렬");
		System.out.println("9.종료");
		System.out.print("메뉴 번호 입력 : ");
		
	}
	public void insertBook() {
		System.out.println("===== 새 도서 추가 =====");
	}
	public void selectList() {
		System.out.println("===== 도서 전체 조회 =====");
	}
	public void searchBook() {
		System.out.println("===== 도서 검색 조회 =====");
	}
	public void deleteBook() {
		System.out.println("===== 도서 삭제 =====");
	}
	public void ascBook() {
		System.out.println("===== 도서 명 오름차순 정렬 =====");
	}

}

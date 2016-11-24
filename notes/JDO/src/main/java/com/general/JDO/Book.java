package com.general.JDO;

public class Book {

	private int bookid;
	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	private String name;
	private String author;
	private String title;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String name, String author, String title) {
		super();
		this.name = name;
		this.author = author;
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}

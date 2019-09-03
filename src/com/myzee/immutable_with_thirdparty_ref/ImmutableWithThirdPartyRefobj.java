package com.myzee.immutable_with_thirdparty_ref;

public class ImmutableWithThirdPartyRefobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAuthor a = new ChildAuthor(1, "nagarj");
		Book b = new Book(11, "Java Advanced Programming", "Technical", a);
		System.out.println(b);
		a.setAuthorName("Nicholos");
		System.out.println(b);
		
		// Using book.getAuthor() and modifying the author details.
		ChildAuthor a1 = b.getChildAuthor();
		a1.setAuthorName("Thomos");
		System.out.println("a1 - " + a1);
		System.out.println(b);
	}

}

final class Book {
	private final int isbnId;
	private final String bookName;
	private final String bookType;
	private final ChildAuthor author;
	
	public Book(int id, String bookName, String bookType, ChildAuthor author) {
		this.isbnId = id;
		this.bookName = bookName;
		this.bookType = bookType;
		this.author = new ChildAuthor(author.getAuthorId(), author.getAuthorName());
	}

	public int getIsbnId() {
		return isbnId;
	}

	public String getBookName() {
		return bookName;
	}

	public String getBookType() {
		return bookType;
	}

	public ChildAuthor getChildAuthor() {
		return author;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book details : " + this.isbnId + ", " + this.bookName + ", " + this.bookType + "\nAuthor details : " + this.author;
	}
	
}

class Author {
	private int authorId;
	private String authorName;
	
	public Author(int id, String name) {
		// TODO Auto-generated constructor stub
		this.authorId = id;
		this.authorName = name;
	}
		
	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.authorId + ", " + this.authorName;
	}	
}

class ChildAuthor extends Author {

	public ChildAuthor(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setAuthorId(int authorId) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void setAuthorName(String authorName) {
		// TODO Auto-generated method stub
//		super.setAuthorName(authorName);
		throw new UnsupportedOperationException();
	}
	
}

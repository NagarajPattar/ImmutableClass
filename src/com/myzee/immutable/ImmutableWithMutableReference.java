package com.myzee.immutable;

public class ImmutableWithMutableReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a = new Author(1, "nagarj");
		Book b = new Book(11, "Java Advanced Programming", "Technical", a);
		System.out.println(b);
		a.authorName = "Nicholos";
		System.out.println(b);
		
		// Using book.getAuthor() and modifying the author details.
		Author a1 = b.getAuthor();
		a1.authorName = "Thomos";
		System.out.println("a1 - " + a1);
		System.out.println(b);
	}

}

final class Book {
	private final int isbnId;
	private final String bookName;
	private final String bookType;
	private final Author author;
	
	public Book(int id, String bookName, String bookType, Author author) {
		this.isbnId = id;
		this.bookName = bookName;
		this.bookType = bookType;
		this.author = new Author(author.authorId, author.authorName);
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

	public Author getAuthor() {
		return author;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book details : " + this.isbnId + ", " + this.bookName + ", " + this.bookType + "\nAuthor details : " + this.author;
	}
	
}

class Author {
	public int authorId;
	public String authorName;
	
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

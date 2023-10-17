package Crud_Case;

public class Book {
	int bookId;
	String bookName;
	String authoreName;
	int prize;
	public Book(int bookid, String bookName, String authoreName, int prize) {
		super();
		this.bookName = bookName;
		this.authoreName = authoreName;
		this.prize = prize;
	}
//	public Book(String bookName, String authoreName, int prize,int id) {
//		super();
//		this.bookId = bookId;
//		this.bookName = bookName;
//		this.authoreName = authoreName;
//		this.prize = prize;
//	}
	public int getBookId() {
		return bookId;
	}
	public void setBookid(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthoreName() {
		return authoreName;
	}
	public void setAuthoreName(String authoreName) {
		this.authoreName = authoreName;
	}
	public int getPrize() {
		return prize;
	}
	public void setPrize(int prize) {
		this.prize = prize;
	}
	

}

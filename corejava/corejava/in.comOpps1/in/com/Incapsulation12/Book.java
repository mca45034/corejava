package in.com.Incapsulation12;

public class Book {
	String bookName;
	int bookPrice;
	String authorName;
	
	public void setBookName(String bookName) {
		this.bookName=bookName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookPrice(int bookprice) {
		this.bookPrice=bookPrice;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setAuthorName(String authoreName) {
		this.authorName=authoreName;
	}
	public void getAuthoreName() {
		
	}
	public void Display() {
		System.out.println("Book name is....:"+bookName);
		System.out.println("BookPrice is....:"+bookPrice);
		System.out.println("Book authore name is...:"+authorName);
		
	}
	

}

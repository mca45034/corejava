package Assigment_28Dec;

public class BookDetailMain {

	public static void main(String[] args) {
		BookDetails b=new BookDetails();
		b.setBookName("Java");
		b.setBookPrice(500);
		b.setAuthorName("Eintein");
		System.out.println(b.getBookName());
		System.out.println(b.getBookPrice());
		System.out.println(b.getAuthorName());

	}

}

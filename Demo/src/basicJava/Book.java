package basicJava;

import java.util.*;

public class Book {
	Scanner sc = new Scanner(System.in);
	private int bookId;
	private String b_Name;
	private int b_Price;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getB_Name() {
		return b_Name;
	}

	public void setB_Name(String b_Name) {
		this.b_Name = b_Name;
	}

	public int getB_Price() {
		return b_Price;
	}

	public void setB_Price(int b_Price) {
		this.b_Price = b_Price;
	}

	public void discount(Book b) {
		System.out.println("Enter the book name");
		String name = sc.next();
		int price = b.getB_Price();

		if (name.equalsIgnoreCase("java")) {

			System.out.println("Original price :" + price);
			int d = price / 10;
			price = price - d;
			System.out.println("U got 10% discount :" + price);
		} else {
			System.out.println(price);

		}

	}

	public static void main(String[] args) {
		Book b = new Book();

		b.setB_Price(300);
		b.setBookId(1);
	
		b.discount(b);

	}
}

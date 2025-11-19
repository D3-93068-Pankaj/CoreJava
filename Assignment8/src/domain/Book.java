package domain;

public class Book implements Comparable<Book>{
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Book() {
		
	}
	
	public Book(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(!(obj instanceof Book))
			return false;
		Book other = (Book)obj;
		if(this.isbn.equals(other.isbn))
			return true;
		else
			return false;
			
	}
	
	@Override
	public int compareTo(Book b) {
		return this.isbn.compareTo(b.isbn);
	}
	
	@Override
	public String toString() {
		return String.format("[ISBN : %s, Author Name : %s, Price : %.2f, Quantity : %d]", this.isbn, this.authorName, this.price, this.quantity);
	}
}

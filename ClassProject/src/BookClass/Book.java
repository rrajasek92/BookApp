package BookClass;

public class Book {
	private String author, bookID, title,description;
	private boolean taxable;
	private double price;
	public Book(String title, String author, String description,Double price, Boolean taxable, String bookID){
		this.title=title;
		this.author=author;
		this.description=description;
		this.price=price;
		this.taxable=taxable;
		this.bookID=bookID;
	}
	public String getBookID(){
		return bookID;
	}
	public void setBookID(String bookID)
	{
		this.bookID=bookID;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isTaxable() {
		return taxable;
	}
	public void setTaxable(boolean taxable) {
		this.taxable = taxable;
	}
	public String getDisplayText(){
		return "Title: "+title+"\n"+"Author: "+author+"\nDescription: "+description;
	}
}

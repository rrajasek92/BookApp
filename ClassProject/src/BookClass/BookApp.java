package BookClass;

public class BookApp {
	public static void main(String[] args){
		String author="Matt Damon";
		String title="The Martian";
		String bookID="1232131";
		double price=8.99;
		boolean taxable=true;
		String description="how you like them apples";
		
		Book myBook = new Book(title, author, description, price, taxable, bookID);
		//myBook.setTitle("The Martian");
		//myBook.setAuthor("Matt Damon");
		//myBook.setBookID("1231432");
		//myBook.setPrice(8.99);
		//myBook.setTaxable(true);
		//myBook.setDescription("how you like them apples");
		//System.out.println(myBook.getTitle()+"\n"+myBook.getAuthor()+"\n"+myBook.getDescription()+"\n"+myBook.getPrice()+"\n"+myBook.isTaxable()+"\n"+myBook.getBookID()+"\n");
		System.out.println(myBook.getDisplayText());
	}

}

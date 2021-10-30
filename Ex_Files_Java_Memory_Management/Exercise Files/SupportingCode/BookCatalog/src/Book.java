
public class Book implements BookReadOnly {
	private int id;
	private String title;
	private String author;
	private Price price;
	
	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getAuthor() {
		return author;
	}

	public Book(int id, String title, String author, Double price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = new Price(price);
	}
	
	public Book(Book oldBook) {
		this.id = oldBook.id;
		this.title = oldBook.title;
		this.author = oldBook.author;
		this.price = new Price(oldBook.price);
	}
	
	@Override
	public String toString() {
		return title + " by " + author;
	}
	
	@Override
	public PriceReadOnly getPrice() {
		return new Price(this.price);
	}
	
	public void setPrice(Double price) {
		this.price = new Price(price);
	}
	
}

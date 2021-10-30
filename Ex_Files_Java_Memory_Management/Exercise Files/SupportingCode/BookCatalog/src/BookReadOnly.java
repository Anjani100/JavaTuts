
public interface BookReadOnly {

	int getId();

	String getTitle();

	String getAuthor();

	String toString();

	PriceReadOnly getPrice();

}
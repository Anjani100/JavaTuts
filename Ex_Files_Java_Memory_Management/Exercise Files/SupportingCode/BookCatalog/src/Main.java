import java.util.List;
import java.util.Map;
import java.util.function.Predicate;


public class Main {

	public static void main(String[] args) {

		BookCollection bc = new BookCollection();
		
		//get price of book called Tom Jones in EUR
		bc.printAllBooks();
		System.out.println("-------------------------------------");
		System.out.println(bc.findBookByName("Tom Jones").getPrice().convert("EUR"));
		System.out.println("-------------------------------------");
		bc.printAllBooks();
		BookReadOnly tom = bc.findBookByName("Tom Jones");
		System.out.println(tom.getTitle());
		PriceReadOnly tomPrice = tom.getPrice();
	}
}

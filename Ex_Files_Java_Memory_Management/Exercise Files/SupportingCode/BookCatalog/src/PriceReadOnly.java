import java.util.Map;

public interface PriceReadOnly {

	Double convert(String toCurrency);

	String toString();

	Map<String, Double> getRates();

}
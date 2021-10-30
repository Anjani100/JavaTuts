
import java.util.HashMap;
import java.util.Map;

public class Price implements PriceReadOnly {

	private Map<String,Double> rates;
	private Double value;
	
	public Price(Double value) {
		this.value = value;
		rates = new HashMap<String,Double>();
		rates.put("USD", 1d);
		rates.put("GBP", 0.6);
		rates.put("EUR", 0.8);
	}
	
	public Price(Price price) {
		this.value = price.value;
		rates = new HashMap<String,Double>();
		rates.put("USD", 1d);
		rates.put("GBP", 0.6);
		rates.put("EUR", 0.8);
	}
		
	@Override
	public Double convert(String toCurrency) {
		if (toCurrency.equals("USD")) {
			Double convertedValue = value;
			return convertedValue;
		}
		else {
			Double conversion = rates.get("USD") / rates.get(toCurrency);
			Double convertedValue = conversion * value;
			return convertedValue;
		}
	}
	
	@Override
	public String toString() {
		return this.value.toString();
	}
	
	@Override
	public Map<String,Double> getRates() {
		return rates;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
}

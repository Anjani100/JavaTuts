import java.math.BigDecimal;

public class CurrencyValues {
    public static void main(String[] args) {
        double value = 0.012;
        System.out.println(value + value + value); // Prints value 0.036000000000000004, i.e., not accurate
        var stringValue = Double.toString(value);
        var bigValue = new BigDecimal(stringValue);
        BigDecimal bigSum = bigValue.add(bigValue).add(bigValue);
        System.out.println(bigSum); // Prints 0.36, hence perfect for currency values
        var pSum = bigSum.doubleValue();
        System.out.println(pSum);
    }
}

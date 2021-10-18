import utilities.ClothingItem;
import utilities.ClothingSize;
import utilities.Pants;
import utilities.Shirt;

import java.text.NumberFormat;
import java.util.Locale;

public class PackageUsage {
    public static void main(String[] args) {
        var shirt = new Shirt(ClothingSize.XL, 1999.99, 3);
        ClothingItem pants = new Pants(ClothingSize.L, 4599.49, 2);
        displayItemCost(shirt);
        displayItemCost(pants);
    }

    public static void displayItemCost(ClothingItem item) {
        var totalPrice = item.getPrice() * item.getQuantity();
        var locale = new Locale("en", "IN");
        var currF = NumberFormat.getCurrencyInstance(locale);
        var output = String.format("Your %d %s order of size %s costs %s",
                item.getQuantity(),
                item.getType(),
                item.getSize(),
                currF.format(totalPrice));
        System.out.println(output);
    }
}
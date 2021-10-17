public class ConvertTypes {
    public static void main(String[] args) {
        short sh = 100;
        int i = sh; // No errors as widening the scope of data
        System.out.println(i);
        // short sho = i;  // Error: java: incompatible types: possible lossy conversion from int to short
        short sho = (short) i;   // Lossy Conversion
        float fl = i;
        // i = fl; // Compilation Error
    }
}

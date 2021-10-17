public class StringTypes {
    public static void main(String[] args) {
        String s1 = "Barry Allen";
        var s2 = s1 + " is the fastest man alive!";
        s2 += "\nOliver Queen is the Green Arrow!";
        System.out.println(s2);
        StringBuilder s3 = new StringBuilder("Kal-El is the Superman!");
        s3.append("\nBruce Wayne is Batman!");
        System.out.println(s3);
    }
}
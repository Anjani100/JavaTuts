public class Placeholder {
    public static void main(String[] args) {
        var name = "Kakashi";
        var power = "Sharingan";
        var numOfJutsu = 1_000;
        var sent = "%s of the %s is the Copy Ninja who has honed %d jutsues";
        var itemString = String.format(sent, name, power, numOfJutsu);
        System.out.println(itemString);
    }
}

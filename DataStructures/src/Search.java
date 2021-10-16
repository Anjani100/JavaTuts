public class Search {
    public static int binarySearch(int[] array, int target) {
        int n = array.length;
        int low = 0, high = n - 1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (array[mid] == target)
                return mid;
            if (array[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {4, 7, 19, 23, 45, 97, 125, 678};
        int target = 19;
        System.out.println("The element " + target + " is present at index " + binarySearch(array, target));
    }
}

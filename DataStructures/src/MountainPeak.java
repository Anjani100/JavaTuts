import java.util.ArrayList;

public class MountainPeak {
    public static int findMaxValue(ArrayList<Integer> nums) {
        int low = 0, high = nums.size() - 1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums.get(mid) > nums.get(mid - 1) && nums.get(mid) > nums.get(mid + 1))
                return mid;
            if (nums.get(mid) > nums.get(mid - 1))
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>() {
            {
                add(3); add(5); add(15); add(50); add(11); add(10); add(8); add(6);
            }
        };
        System.out.println("The maximum value is at index " + findMaxValue(nums));
    }
}

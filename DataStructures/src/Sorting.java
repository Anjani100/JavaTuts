import java.util.ArrayList;

public class Sorting {
    public static ArrayList<Integer> MergeSort(ArrayList<Integer> array, ArrayList<Integer> nums, int low, int high) {
        if (high - low < 2) return array;
        int mid = (low + high) / 2;
        ArrayList<Integer> left = MergeSort(array, nums, low, mid);
        ArrayList<Integer> right = MergeSort(array, nums, mid, high);
        int i = low, j = mid, k = low;
        while (i < mid && j < high) {
            if (left.get(i) <= right.get(j)) {
                nums.set(k, left.get(i));
                i++;
            }
            else {
                nums.set(k, right.get(j));
                j++;
            }
            k++;
        }
        while (i < mid) {
            nums.set(k, left.get(i));
            i++;
            k++;
        }
        while (j < high) {
            nums.set(k, right.get(j));
            j++;
            k++;
        }
        for (i = low; i < high; i++)
            array.set(i, nums.get(i));
        return array;
    }
    public static int partition(ArrayList<Integer> array, int low, int high) {
        int i, j = low - 1, temp;
        for (i = low; i < high - 1; i++) {
            if (array.get(i) <= array.get(high - 1)) {
                j++;
                temp = array.get(j);
                array.set(j, array.get(i));
                array.set(i, temp);
            }
        }
        j++;
        temp = array.get(j);
        array.set(j, array.get(high - 1));
        array.set(high - 1, temp);
        return j;
    }
    public static void QuickSort(ArrayList<Integer> array, int low, int high) {
        if (high - low < 2) return;
        int pivot = partition(array, low, high);
        QuickSort(array, low, pivot);
        QuickSort(array, pivot, high);
    }
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>() {
            {
                add(157);
                add(75);
                add(19);
                add(230);
                add(42);
                add(99);
                add(1251);
                add(66);
            }
        };
        System.out.println(array);
//        ArrayList<Integer> nums = new ArrayList<Integer>();
//        nums.addAll(array);
//        array = MergeSort(array, nums, 0, array.size());
//        System.out.println(array);
        QuickSort(array, 0, array.size());
        System.out.println(array);
    }
}
//
//9 5 8 2 1 7 10 6
//
//5 2 1 6 8 7 10 9
package Task1_BinSearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 12, 10, 9, 7, 5, 3, 2, 0, -1, 6, 9, 10, 14, 20};
        int left = 0;
        int right = arr.length - 1;
        //15, 7,
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        System.out.println(right);

    }
}
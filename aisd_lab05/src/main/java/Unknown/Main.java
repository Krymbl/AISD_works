package Unknown;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 1, 0, 2, 1, 2, 0, 0, 0, 2, 2, 1, 0};
        int left = 0;
        int right = arr.length - 1;
        int mid = 1;
        while (mid <= right) {
            if (arr[right] == 2) {
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }

            if (arr[mid] > arr[right]) {
                int temp = arr[mid];
                arr[mid] = arr[right];
                arr[right] = temp;
            }

            if (arr[left] > arr[mid]) {
                int temp = arr[mid];
                arr[mid] = arr[left];
                arr[left] = temp;
            }


            mid++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
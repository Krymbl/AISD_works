package Task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 12, 10, 9, 7, 5, 3, 2, 6, 9, 10, 14, 20};
        int s = 51;
        int temp = 0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (temp + arr[i] > s) {
                System.out.println(i + " Конец");
                break;
            } else {
                temp += arr[i];
            }
        }
}
}

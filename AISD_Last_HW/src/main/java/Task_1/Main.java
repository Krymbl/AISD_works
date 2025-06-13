package Task_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {-1, 2, 1, -4, 5, 7, -10};
        int t = 1;
        int[] list = trio(array, t);
        System.out.println(Arrays.toString(list));
    }

    public static int[] trio(int[] array, int t) {
        Arrays.sort(array);
        int n = array.length;
        int difference = Integer.MAX_VALUE;
        int[] trioArray = new int[3];

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = array[i] + array[left] + array[right];
                int currentDiff = Math.abs(currentSum - t);

                if (currentDiff < difference) {
                    difference = currentDiff;
                    trioArray[0] = array[i];
                    trioArray[1] = array[left];
                    trioArray[2] = array[right];
                }

                if (currentSum < t) {
                    left++;
                } else if (currentSum > t) {
                    right--;
                } else {
                    return trioArray;
                }
            }
        }
        return trioArray;
    }


}
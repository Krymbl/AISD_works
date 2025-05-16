package BinSearch;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 5};
        int a = 3;
        search(array,a);


    }
        public static void search(int[] arr, int a) {
            int left = 0;
            int right = arr.length - 1;
            int mid = (left + right) / 2;

            while (left <= right) {
                mid = (left + right) / 2;
                if (arr[mid] < a) {
                    left = mid + 1;
                } else if (arr[mid] >= a) {
                    right = mid - 1;
                }
            }
            System.out.print("Левый индекс: " + left);
            left = mid;
            right = arr.length - 1;

            while (left <= right) {
                mid = (left + right) / 2;
                if (arr[mid] <= a) {
                    left = mid + 1;
                } else if (arr[mid] > a) {
                    right = mid - 1;
                }
            }
            System.out.println(". Правый индекс: " + right);
        }


}
import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] stalls = new int[N];

        for (int i = 0; i < N; i++) {
            stalls[i] = scanner.nextInt();
        }

        System.out.println(findDistance(stalls, K));
    }

    public static int findDistance(int[] stalls, int K) {
        Arrays.sort(stalls);
        int left = 0;
        int right = stalls[stalls.length - 1] - stalls[0];
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canPlace(stalls, K, mid)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    private static boolean canPlace(int[] stalls, int K, int minDist) {
        int count = 1;
        int lastPosition = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= minDist) {
                count++;
                lastPosition = stalls[i];
                if (count == K) {
                    return true;
                }
            }
        }
        return false;
    }
}
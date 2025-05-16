package Task2_Array;

//Код, если работа только с мапом

import java.util.HashMap;

public class MainHashMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] array = {1, 2, 3, 4, 3, 2};
        int k = 4;
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], i);
            } else {
                if (i - map.get(array[i]) <= k) {
                    System.out.println(true + " " + map.get(array[i]) + " " + i);
                }
            }
        }

    }
}
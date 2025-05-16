package Task3_Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        int arr1[] = {2, 4, 4, 1};
        int arr2[] = {2, 2, 4, 5};
        ArrayList<Integer> list = new ArrayList<>();


        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            if (map1.containsKey(arr1[i])) {
                map1.put(arr1[i], map1.get(arr1[i]) + 1);
            } else {
                map1.put(arr1[i], 1);
            }
        }


        for (int i = 0; i < arr2.length; i++) {
            if (map2.containsKey(arr2[i])) {
                map2.put(arr2[i], map2.get(arr2[i]) + 1);
            } else {
                map2.put(arr2[i], 1);
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            if (map2.containsKey(arr1[i])) {
                for (int j = 0; j < (map1.get(arr1[i]) < map2.get(arr1[i]) ? map1.get(arr1[i]) : map2.get(arr1[i])); j++) {
                    list.add(arr1[i]);
                }
                map2.remove(arr1[i]);
            }
        }
        System.out.println(list);
    }
}

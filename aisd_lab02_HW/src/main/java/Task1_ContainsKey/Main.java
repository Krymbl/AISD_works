package Task1_ContainsKey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();
        while (!string.equals("exit")) {
            if (map.containsKey(string)) {
                map.put(string, map.get(string)+1);
            } else {
                list.add(string);
                map.put(string, 1);
            }
            string = scanner.nextLine();
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Строка: '" + list.get(i) + "'. Кол-во вхождений: " + map.get(list.get(i)));
        }
    }
}
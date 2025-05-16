package Task2_Array;

//Код, если работа только с массивами

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 3, 2};
        int k = 2;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && (j - i) <= k && i != j && j > i) {
                    System.out.println(i + " " + array[i] + " " + j + " " + array[j]);
                }
            }

        }
    }
}
package Task2_ArrayString;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String string = "the sky is blue";
        char[] stringChar = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            stringChar[i] = string.charAt(string.length() - 1 - i);
        }
        int left = 0;
        int right = string.length();
        int mid = 1;
        while (mid < right) {
            if ((stringChar[mid] != ' ') && (stringChar[left] != ' '))  {
                char temp = stringChar[left];
                stringChar[left] = stringChar[mid];
                stringChar[mid] = temp;
                mid++;
            } else {
                left++;
                mid = left + 1;
            }
        }

        char temp = stringChar[left + 1];
        stringChar[left + 1] = stringChar[mid - 1];
        stringChar[mid - 1] = temp;


        System.out.println(stringChar);

    }
}

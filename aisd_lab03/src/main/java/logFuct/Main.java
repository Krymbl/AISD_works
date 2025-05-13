package logFuct;

import java.util.LinkedList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println(logFuct(10));
    }
    public static double logFuct(int n){
        if (n < 1) {
            return 0;
        } else {
            return Math.log(n) + logFuct(n-1);
        }
    }
}
package Task4_Evklid;

public class Main {
    public static void main(String[] args) {
        int n = 25;
        int v = 10;
        System.out.println(evklid(n,v));
    }

    public static int evklid(int n, int v) {
        if (n % v == 0) {
            return v;
        } else {
            return evklid(v % n, n);
        }
    }
}

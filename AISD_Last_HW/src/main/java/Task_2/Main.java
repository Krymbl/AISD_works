package Task_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> actions = new ArrayList<>();
        actions.add(List.of());
        actions.add(List.of(1));
        actions.add(List.of(1));
        actions.add(List.of(1, 2));
        actions.add(List.of(1, 3));
        actions.add(List.of(1, 3));

        int n = 3;
        boolean firstWinner = actionToWin(n, actions);
        System.out.println(firstWinner ? "Победил первый игрок!" : "Победил аторой игрок!");
    }

    public static boolean actionToWin(int n, List<List<Integer>> actions) {
        boolean[] check = new boolean[n + 1];
        check[0] = false;

        for (int i = 1; i <= n; i++) {
            boolean winner = false;
            for (int action : actions.get(i)) {
                if (action <= i && !check[i - action]) {
                    winner = true;
                    break;
                }
            }
            check[i] = winner;
        }

        return check[n];
    }


}
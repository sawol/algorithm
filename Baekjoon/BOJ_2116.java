package BOJ.IM대비;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_2116{
    private static int next (int before){            // 윗면 <-> 아랫면
        switch (before){
            case 0:
                return 5;
            case 5:
                return 0;
            case 1:
                return 3;
            case 3:
                return 1;
            case 2:
                return 4;
            case 4:
                return 2;
        }
        return -1;
    }

    private static int maxSide(int down, ArrayList<Integer> dice){
        int diceMax = 0;                // 한 주사위의 최대 면
        for(int x=0; x<6; x++){
            if(x == down || x == next(down)){
                continue;
            }
            diceMax = Math.max(dice.get(x), diceMax);
        }
        return diceMax;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();           // 주사위 개수
        ArrayList<ArrayList<Integer>> dices = new ArrayList<>();
        int max = 0;         // 첫번째 주사위의 위치에 따라 한 면의 최대값

        // 2차원 배열에 주사위 담기
        for(int i=0; i<n; i++){
            dices.add(new ArrayList<>());
            for(int j=0; j<6; j++) {
                dices.get(i).add(sc.nextInt());
            }
        }

        int[] sum = new int[6];      // 6면중 각면당 합
        for(int i=0; i<6; i++){         // 첫번째 주사위 윗면을 A, B, C... 순으로 선택
            int down = i;
            int up = dices.get(0).get(next(down));
            sum[i] = maxSide(down, dices.get(0));
            for(int j=1; j<n; j++){
                down = dices.get(j).indexOf(up);
                up = dices.get(j).get(next(down));
                sum[i] += maxSide(down, dices.get(j));
            }
            max = Math.max(max, sum[i]);
        }
        System.out.println(max);
    }
}

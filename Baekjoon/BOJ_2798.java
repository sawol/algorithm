package BOJ.IM대비;

import java.util.Scanner;

public class BOJ_2798 {
    static int[] cards;
    static int N;
    static int M;
    static int result = 0;

    private static void subset(int sum, int idx, int cnt){
        if(cnt == 3){
            if(M >= sum){
                result = Math.max(result, sum);
            }
            return;
        }
        if(idx == N){
            return;
        }
        subset(sum+cards[idx], idx+1, cnt+1);          // 카드를 선택할 경우
        subset(sum, idx+1, cnt);                          // 카드를 선택하지 않을 경우
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        cards = new int[N];

        for(int i=0; i<N; i++){
            cards[i] = sc.nextInt();        // 카드 배열 생성
        }
        subset(0,0, 0);
        System.out.println(result);
    }
}

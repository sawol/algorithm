package BOJ.IM대비;

import java.io.IOException;
import java.util.Scanner;

public class BOJ_2578{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        final int N = 5;
        int[][] map = new int[N][N];
        int[] check = new int[N*2+2];
        int bingoCnt = 0;

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                map[i][j] = sc.nextInt();
            }
        }
        for(int x=0; x<N*N; x++) {
            int target = sc.nextInt();

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (map[i][j] == target) {
                        check[i] += 1;
                        check[j+5] += 1;
                        if(i == j){
                            check[10] += 1;
                        }
                        if(i+j == 4){
                            check[11] += 1;
                        }
                    }
                }
            }

            for(int i=0; i<check.length; i++){
                if(check[i]==5){
                    check[i] = -1;
                    bingoCnt += 1;
                }
            }
            if(bingoCnt >2){
                System.out.println(x+1);
                break;
            }
        }
    }
}
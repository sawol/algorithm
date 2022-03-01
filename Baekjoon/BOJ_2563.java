package BOJ.IM대비;

import java.io.IOException;
import java.util.Scanner;

public class BOJ_2563{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();     // 색종이 개수
        final int N = 100;
        int[][] map = new int[N][N];
        int result = 0;

        for(int i=0; i<num; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int a=x; a<x+10; a++){
                for(int b=y; b<y+10; b++){
                    if(map[a][b] == 0) {
                        map[a][b] = 1;
                        result += 1;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
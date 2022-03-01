package BOJ.IM대비;

import java.io.IOException;
import java.util.Scanner;

public class BOJ_2669{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[100][100];
        int result = 0;

        for(int i=0; i<4; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            for(int x=a; x<c; x++){
                for(int y=b; y<d; y++){
                    if(map[x][y] == 0) {
                        map[x][y] = 1;
                        result += 1;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
package BOJ.IM대비;

import java.io.IOException;
import java.util.Scanner;

public class BOJ_10157{
    static int flag = 1;
    static int num;
    static int c;
    static int r;

    private static void recur(int[][] arr, int x, int y){
        if(num == 0){
            return;
        }
        if(x < 0 || y < 0 || x >= r || y >= c || arr[x][y] != 0){
            if(flag < 4){
                flag++;
            }else{
                flag = 1;
            }
            return;
        }
        arr[x][y] = num--;
        if (flag == 1){
            recur(arr, x - 1, y);
        }
        if (flag == 2){
            recur(arr, x, y + 1);
        }
        if (flag == 3){
            recur(arr, x + 1, y);
        }
        if (flag == 4){
            recur(arr, x, y - 1);
            recur(arr, x - 1, y);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        r = sc.nextInt();
        num = sc.nextInt();
        if(c*r < num){
            System.out.println(0);
        }else {
            int[][] map = new int[r][c];
            recur(map,r-1, 0);

            for(int i=0; i<r; i++){
                for(int j=0; j<c; j++){
                    if(map[i][j]==1) System.out.println((j+1)+ " " + (r-i));
                }
            }
        }
    }
}
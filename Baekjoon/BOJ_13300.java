package BOJ.IM대비;

import java.io.IOException;
import java.util.Scanner;

public class BOJ_13300{

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] tmp = new int[6][2];
        int result = 0;

        for(int i=0; i<n; i++){
            int s = sc.nextInt();
            int y = sc.nextInt();
            tmp[y-1][s] += 1;
        }
        for(int i=0; i<tmp.length; i++){
            for(int j=0; j<tmp[0].length; j++){
                if(tmp[i][j]%k > 0){
                    result += tmp[i][j]/k + 1;
                }
                else{
                    result += tmp[i][j]/k;
                }
            }
        }
        System.out.println(result);
    }
}
package BOJ.IM대비;

import java.io.IOException;
import java.util.Scanner;

public class BOJ_10163{

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int map[][] = new int[1001][1001];
        int[] result = new int[n];

        for(int i=1; i<=n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int w = sc.nextInt();
            int h = sc.nextInt();

            for(int p=x; p<x+w; p++){
                for(int q=y; q<y+h; q++){
                    if(map[p][q] == 0){
                        map[p][q] = i;
                    }
                    else{
                        result[map[p][q]-1] -= 1;
                        map[p][q] = i;
                    }
                    result[i-1] += 1;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.println(result[i]);
        }
    }
}
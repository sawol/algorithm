package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2231 {
    static int N;
    static int NL;                  // N 길이
    static int result;
    static int tmp;

    private static void solv(int n, int sum, int c){
        if(n == 0) {
            if(sum == N){
                result = tmp;
            }
            return;
        }
        int a = n%c;
        int b = n/c;
        solv(a, sum+b, c/10);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        N = Integer.parseInt(str);
        NL = str.length();

        int c = 1;
        for(int i=1; i<NL; i++){
            c *= 10;
        }

        for(int i=1; i<N; i++){
            tmp = i;
            solv(tmp, i , c);
            if(result > 0) break;
        }
        System.out.println(result);
    }
}

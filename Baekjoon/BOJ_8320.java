package BOJ.IM대비;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_8320 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int result = 0;

        for(int i=1; i<=N; i++){
            int cnt = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    cnt += 1;
                }
            }
            result += (cnt%2 + cnt)/2;
        }
        System.out.println(result);
    }
}

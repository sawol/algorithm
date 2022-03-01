package BOJ.IM대비;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2999 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        int r = 0;
        int c = 0;
        for(int i=1; i<=str.length(); i++){
            if(str.length()%i == 0){
                if(i > str.length()/i){         // r이 c보다 커지면
                    break;                      // 멈추기 -> 이전 r, c 값이 정답이 됨
                }
                r = i;
                c = str.length()/i;
            }
        }

        for(int i=0; i<r; i++){
            for(int j=i; j<str.length(); j+=r){
                System.out.print(str.substring(j,j+1));
            }
        }
    }
}

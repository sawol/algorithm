package BOJ.개인;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[][] map = new char[8][8];
        int result = 0;

        for(int i=0; i<8; i++){
            map[i] = in.readLine().toCharArray();
            for(int j=0; j<8; j++){
                if(i%2 == 0 && j%2 == 0 && map[i][j] == 'F'){       // 흰색
                    result++;
                }else if(i%2 == 1 && j%2 == 1 && map[i][j] == 'F'){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}

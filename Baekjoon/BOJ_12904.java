package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// S -> T 로 될 수 있느냐는 문제 : 역발상으로 T -> S로 갈수 있는지 확인하면 됨(그리디)

public class BOJ_12904 {
    static StringBuilder S = new StringBuilder();
    static StringBuilder T = new StringBuilder();
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        S.append(in.readLine());
        T.append(in.readLine());

        while(true){
            if(T.toString().equals(S.toString())){       // S로 T를 만들 수 있음
                result = 1;
                break;
            }
            if(T.length()==0)   break;           // S로 T를 만들 수 없음

            if(T.charAt(T.length()-1) == 'A'){        // 마지막 글자가 A라면
                T.deleteCharAt(T.length()-1);         // A연산을 한 후니까 A만 떼어주면 됨
            }else{                                  // 마지막 글자가 B라면
                T.deleteCharAt(T.length()-1);         // B연산을 한 후니까 B를 떼어주고 뒤집어야함
                T.reverse();
            }
        }
        System.out.println(result);
    }
}

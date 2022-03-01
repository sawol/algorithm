package BOJ.웹엑스수업;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1759 {
    private static int L;
    private static int C;
    private static String[] pw;

    private static void subset(String passwd, int cnt, int idx, int con, int vow){
        if(cnt == L){                           // 만약, 패스워드 길이가 L이고
            if(vow > 0 && con > 1) {            // 모음이 1개 이상, 자음이 2개 이상일 경우
                System.out.println(passwd);     // 패스워드 출력
            }
            return;
        }
        if(idx == C){                           // 인덱스를 넘어간 경우 리턴
            return;
        }
        if(pw[idx].equals("a") || pw[idx].equals("e") || pw[idx].equals("i") || pw[idx].equals("o") || pw[idx].equals("u")){
            subset(passwd+pw[idx], cnt+1, idx+1, con, vow+1);   // 비밀번호로 모음을 선택했을 경우
        }
        else{
            subset(passwd+pw[idx], cnt+1, idx+1, con+1, vow);   // 비밀번호로 자음을 선택했을 경우
        }
        subset(passwd, cnt, idx+1, con, vow);                         // 비밀번호로 선택하지 않았을 경우
    }


    public static void main(String[] args) throws IOException {
        // 최소 한 개의 모음(a,e,i,o,u)과 두 개의 자음 , 오름차순으로 정렬
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] str = in.readLine().split(" ");
        L = Integer.parseInt(str[0]);
        C = Integer.parseInt(str[1]);
        pw = in.readLine().split(" ");
        Arrays.sort(pw);                        // 오름차순으로 정렬

        subset("", 0, 0, 0, 0);
    }
}

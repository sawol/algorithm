package BOJ.IM대비;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = in.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        boolean bracket = false;


        for(int i=0; i<arr.length; i++){

            if(arr[i] == '<'){                  // 지금부터 태그라는 표시
                bracket = true;
                sb.append(tmp.reverse());       // 이전까지 저장한 단어를 뒤집은 뒤 저장
                tmp.delete(0,tmp.length());     // tmp 비우기
                sb.append(arr[i]);
                continue;
            }
            else if(arr[i] == '>'){             // 태그가 끝남
                bracket = false;
                sb.append(arr[i]);
                continue;
            }
            else if(i == arr.length-1) {
                tmp.append(arr[i]);
                sb.append(tmp.reverse());
                tmp.delete(0, tmp.length());
            }
            if(arr[i] == ' ' && !bracket){      // 태그가 아니고 단어
                sb.append(tmp.reverse());
                sb.append(arr[i]);              // 띄어쓰기도 넣기
                tmp.delete(0,tmp.length());
            }
            else if(!bracket) {                      // 단어이면
                tmp.append(arr[i]);             // tmp에 저장
            }else if(bracket){
                sb.append(arr[i]);             // 태그는 그대로 저장
            }
        }
        System.out.println(sb);
    }
}

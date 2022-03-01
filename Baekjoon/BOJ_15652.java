package BOJ.개인;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15652 {
    static int N, M;
    static boolean[] visited;
    static char[] selected;
    static StringBuilder sb = new StringBuilder();

    private static void permutation(int cnt, int bn){
        if(cnt==M)  {
            sb.append(selected);
            return;
        }

        for(int i=bn; i<N; i++){
            selected[cnt*2] = (char)(i+1+'0');
            permutation(cnt+1, i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N];
        selected = new char[M*2];

        for(int i=1; i<selected.length; i+=2){
            selected[i] = ' ';
        }
        selected[M*2-1] = '\n';

        permutation(0, 0);
        System.out.println(sb);
    }
}

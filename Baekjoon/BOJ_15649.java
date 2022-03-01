package BOJ.개인;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15649 {
    static int N, M;
    static boolean[] visited;
    static int[] selected;
    static StringBuilder sb;

    private static void permutation(int cnt){
        if(cnt==M)  {
            sb = new StringBuilder();
            for(int s: selected){
                sb.append(s+" ");
            }
            System.out.println(sb);
            return;
        }

        for(int i=0; i<N; i++){
            if(visited[i])  continue;
            visited[i] = true;
            selected[cnt] = i+1;
            permutation(cnt+1);
            visited[i] = false;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N];
        selected = new int[M];

        permutation(0);
    }
}

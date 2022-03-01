package BOJ.개인;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15650 {
    static int N, M;
    static boolean[] visited;

    private static void permutation(int cnt, String result, int bn){
        if(cnt==M)  {
            System.out.println(result);
            return;
        }

        for(int i=bn; i<N; i++){
            if(visited[i])  continue;
            visited[i] = true;
            permutation(cnt+1, result+(i+1)+" ", i);
            visited[i] = false;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N];

        permutation(0, "", 0);
    }
}

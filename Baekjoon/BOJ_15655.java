import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_15655 {
    static int N, M;
    static int[] arr;
    static boolean[] visited;
    static int[] selected;
    static StringBuilder sb = new StringBuilder();

    private static void permutation(int cnt, int bn){
        if(cnt==M)  {
            for(int v: selected) {
                sb.append(v);
                sb.append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=bn; i<N; i++){
            if(visited[i]) continue;
            visited[i] = true;
            selected[cnt] = arr[i];
            permutation(cnt+1, i);
            visited[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(in.readLine(), " ");

        arr = new int[N];
        visited = new boolean[N];
        selected = new int[M];

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        permutation(0, 0);
        System.out.println(sb);
    }
}
package BOJ.개인;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_15656 {
    static int N, M;
    static int[] arr;
    static int[] selected;
    static StringBuilder sb = new StringBuilder();

    private static void permutation(int cnt){
        if(cnt==M)  {
            for(int v: selected) {
                sb.append(v);
                sb.append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0; i<N; i++){
            selected[cnt] = arr[i];
            permutation(cnt+1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(in.readLine(), " ");

        arr = new int[N];
        selected = new int[M];

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        permutation(0);
        System.out.println(sb);
    }
}

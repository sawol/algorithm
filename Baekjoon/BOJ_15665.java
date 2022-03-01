package BOJ.개인;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_15665 {
    static int N, M;
    static int[] arr;
    static int[] selected;
    static HashMap<String, Boolean> deduplicated = new HashMap<String, Boolean>();
    static String s;
    static StringBuilder sb = new StringBuilder();

    private static void permutation(int cnt){
        if(cnt==M)  {
            s = new String();
            for(int v: selected) {
                s += v + " ";
            }
            if(deduplicated.get(s) == null) {
                deduplicated.put(s, true);
                sb.append(s);
                sb.append("\n");
            }
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

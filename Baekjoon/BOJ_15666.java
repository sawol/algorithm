package BOJ.개인;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_15666 {
    static int N, M;
    static Integer[] arr;
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

        for(int i=bn; i<arr.length; i++){
            selected[cnt] = arr[i];
            permutation(cnt+1, i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(in.readLine(), " ");

        Set<Integer> tmp = new HashSet<>();

        for(int i=0; i<N; i++){
            tmp.add(Integer.parseInt(st.nextToken()));
        }

        arr = tmp.toArray(new Integer[0]);
        Arrays.sort(arr);

        selected = new int[M];

        permutation(0, 0);
        System.out.println(sb);
    }
}

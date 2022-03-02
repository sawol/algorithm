package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1535 {
    static int N;
    static int[] health;
    static int[] pleasure;
    static int result;

    private static void subset(int sumHealth, int sumPleasure, int idx){
        if(sumHealth <= 0){
            return;
        }
        if(idx == N){
            if(result < sumPleasure)    result = sumPleasure;
            return;
        }
        subset(sumHealth-health[idx], sumPleasure+pleasure[idx], idx+1);
        subset(sumHealth, sumPleasure, idx+1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(in.readLine());
        health = new int[N];
        pleasure = new int[N];
        StringTokenizer st1 = new StringTokenizer(in.readLine()," ");
        StringTokenizer st2 = new StringTokenizer(in.readLine()," ");

        for(int i=0; i<N; i++){
            health[i] = Integer.parseInt(st1.nextToken());
            pleasure[i] = Integer.parseInt(st2.nextToken());
        }

        subset(100,0,0);
        System.out.println(result);
    }
}

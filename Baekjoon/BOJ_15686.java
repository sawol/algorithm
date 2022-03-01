package BOJ.웹엑스수업;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_15686 {
    static int N;
    static int M;
    static int[][] map;
    static ArrayList<int[]> chickenHouse = new ArrayList<>();
    static ArrayList<int[]> house = new ArrayList<>();
    static int[][] selected;
    static int minChickenDist = Integer.MAX_VALUE;

    public static void distance(){
        int dist = 0;                     // 도시의 치킨 거리

        for(int[] h: house){
            int nearCH = Integer.MAX_VALUE;                     // 특정 집에서 가장 가까운 치킨집 거리
            for(int[] c: selected){
                int tmpDist = Math.abs(h[0]-c[0]) + Math.abs(h[1]-c[1]);        // 집 위치 - 치킨집 위치
                if(nearCH > tmpDist)    nearCH = tmpDist;                       // 집과 이전 치킨집의 위치보다 더 가까운 치킨집이 있으면 값 바꾸기
            }
            dist += nearCH;                     // 각 집 별 가장 가까운 치킨집 거리를 치킨 거리에 더하기
        }
        if(dist < minChickenDist)   minChickenDist = dist;                  // 만약 도시의 치킨거리 중 최소값을 찾으면 그 값으로 바꾸기
    }

    public static void combination(int idx, int cnt){                   // M개의 치킨집 선택하기
        if(cnt == M) {
            distance();
            return;
        }

        for(int i=idx; i<chickenHouse.size(); i++){
            selected[cnt] = chickenHouse.get(i);
            combination(i+1, cnt+1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        selected = new int[M][2];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(in.readLine()," ");
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 2) chickenHouse.add(new int[]{i,j});
                if(map[i][j] == 1) house.add(new int[]{i,j});
            }
        }
        combination(0,0);
        System.out.println(minChickenDist);
    }
}

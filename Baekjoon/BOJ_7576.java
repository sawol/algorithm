package BOJ.웹엑스수업;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_7576 {
    static int N, M;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] map;
    static ArrayList<int[]> start = new ArrayList<>();
    static int day;
    static int tomato;                  // 안익은 토마토 수

    public static void bfs(){
        Queue<int[]> que = new LinkedList<>();
        for(int[] s: start) {
            que.add(s);                 // int[] = X 값 , Y 값, 날짜
        }

        while(!que.isEmpty()){
            int[] xyd = que.poll();
            int x = xyd[0];             // 세로
            int y = xyd[1];             // 가로
            int d = xyd[2];             // 날짜
            day = d;

            for(int i=0; i<dx.length; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= 0 && ny >= 0 && nx < N && ny < M && map[nx][ny] == 0){
                    map[nx][ny] = 1;       // 방문 체크
                    tomato--;               // 안익은 토마토에서 익은 토마토 개수 빼기
                    que.add(new int[]{nx,ny,d+1});
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine()," ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new int[N][M];


        for(int i=0; i<N; i++){
            st = new StringTokenizer(in.readLine()," ");
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 0)  tomato++;               // 안익은 토마토 개수 카운팅
                if(map[i][j] == 1)  start.add(new int[]{i,j,0});            // 익은 토마토를 시작점으로 하기 위해 리스트에 저장
            }
        }
        bfs();
        if(tomato>0) System.out.println(-1);
        else System.out.println(day);
    }
}

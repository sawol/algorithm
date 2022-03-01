package BOJ.웹엑스수업;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_16236 {
    static int N;
    static int[][] map;
    static int sharkBody = 2;
    static int[] dx = {-1, 0, 0, 1};            // 상 좌 우 하
    static int[] dy = {0, -1, 1, 0};
    static int eatCnt;
    static int time;

    public static void bfs(int[] startPoint){
        PriorityQueue<int[]> que = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[2] == o2[2]){                 // 시간(거리)이 같으면
                    if(o1[0] == o2[0]){             // 높이가 같으면
                        return o1[1] - o2[1];       // 왼쪽의 물고기를 선택
                    }
                    return o1[0] - o2[0];           // 높이가 다르면 높은것을 선택
                }
                return o1[2] - o2[2];               // 시간(거리)이 다르면 시간(거리)이 짧은 순으로
            }
        });

        que.offer(startPoint);
        int[][] visited = new int[N][N];
        visited[startPoint[0]][startPoint[1]] = 1;
        map[startPoint[0]][startPoint[1]] = 0;              // 현재 상어 위치 0으로 세팅

        while(!que.isEmpty()){
            int[] xyt = que.poll();
            int x = xyt[0];
            int y = xyt[1];
            int t = xyt[2];
            if(map[x][y] != 0 && map[x][y] < sharkBody) {             // 먹을 수 있는 물고기가 있다면
                eatCnt++;                       // 그 물고리를 먹는다
                map[x][y] = 9;                // 상어 위치 옮기기

                if (eatCnt == sharkBody) {                // 상어의 크기만큼 물고기를 먹으면 크기 증가
                    sharkBody++;
                    eatCnt = 0;
                }
                time = t;
                bfs(new int[]{x, y, t});
                return;
            }

            for(int i=0; i<dx.length; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= 0 && ny >= 0 && nx < N && ny < N && visited[nx][ny] == 0 && map[nx][ny] <= sharkBody){                 // 상어의 크기보다 작으면 그 길로 상어 이동
                    visited[nx][ny] = 1;          // 방문 체크
                    que.offer(new int[]{nx, ny, t+1});
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(in.readLine());
        int[] startPoint = new int[3];                  // 상어 시작 위치 및 시간 저장
        map = new int[N][N];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(in.readLine()," ");
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 9){
                    startPoint[0] = i;
                    startPoint[1] = j;
                    startPoint[2] = 0;
                }
            }
        }
        bfs(startPoint);
        System.out.println(time);
    }
}

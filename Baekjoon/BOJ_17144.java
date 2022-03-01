package BOJ.웹엑스수업;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_17144 {
    static int R, C, T;
    static int[][] map;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static ArrayList<Integer> cleanerX = new ArrayList<>();         // 공기 청정기 위치

    public static void spreading(ArrayList<int[]> dustList){           // 미세먼지 퍼짐
        ArrayList<int[]> nextDustList = new ArrayList<>();          // 다음 미세먼지 정보 담을 배열

        for(int[] dust: dustList){
            int x = dust[0];                                     // 가로
            int y = dust[1];                                     // 세로

            int dustCnt = 0;                                        // 먼지가 인접한 네방향중 퍼질 수 있는 방향의 수
            ArrayList<int[]> tmp = new ArrayList<>();               // 퍼진 먼지양을 계산하는 동안 퍼져간 미세먼지 위치 담는 임시 리스트

            for(int i=0; i<dx.length; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx>=0 && ny>=0 && nx<R && ny<C && map[nx][ny] >= 0){         // 먼지와 인접한 네 방향 중 먼지가 이동 가능한 경우가 있다면
                    dustCnt++;
                    tmp.add(new int[]{nx, ny, 0});
                }
            }

            // 퍼질 수 있는 먼지양 계산하여 퍼진 먼지양을 맵에 업데이트
            for(int i=0; i<dustCnt; i++) {
                tmp.get(i)[2] = map[x][y] / 5;
                nextDustList.add(tmp.get(i)); // 업데이트할 먼지들을 모두 배열에 담기
            }
            // 퍼져간 먼지의 양을 음수로 표현하고 리스트에 담아 미세먼지 양 업데이트할때 자동으로 빠지도록 함
            nextDustList.add(new int[] {x,y,-(map[x][y] / 5) * dustCnt});
        }

        for(int[] d: nextDustList){                                     // 현재 퍼져진 미세먼지 업데이트
            map[d[0]][d[1]] += d[2];                                // 원래 미세먼지에 업데이트 할 값 더하기
        }
    }

    public static void onCleaner(){
        // up (반시계 방향)
        for(int i=cleanerX.get(0)-1; i>0; i--){             // 아래
            map[i][0] = map[i-1][0];
        }
        for(int i=0; i<C-1; i++){                           // <-
            map[0][i] = map[0][i+1];
        }
        for(int i=1; i<=cleanerX.get(0); i++){             // 위
            map[i-1][C-1] = map[i][C-1];
        }
        for(int i=C-1; i>0; i--){                           // ->
            if(i==1){ map[cleanerX.get(0)][i] = 0;}                                      // 공기청정기에서 바람 나오니까 0 넣기
            else map[cleanerX.get(0)][i] = map[cleanerX.get(0)][i-1];
        }

        // down(시계 방향)
        for(int i=cleanerX.get(1)+1; i<R-1; i++){             // 위
            map[i][0] = map[i+1][0];
        }
        for(int i=0; i<C-1; i++){                           // <-
            map[R-1][i] = map[R-1][i+1];
        }
        for(int i=R-2; i>=cleanerX.get(1); i--){             // 아래
            map[i+1][C-1] = map[i][C-1];
        }
        for(int i=C-1; i>0; i--){                           // ->
            if(i==1){ map[cleanerX.get(1)][i] = 0;}                                      // 공기청정기에서 바람 나오니까 0 넣기
            else map[cleanerX.get(1)][i] = map[cleanerX.get(1)][i-1];
        }
    }

    public static ArrayList<int[]> findDust(){
        ArrayList<int[]> dustList = new ArrayList<>();
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if(map[i][j] > 0)   dustList.add(new int[]{i,j,0});
            }
        }
        return dustList;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine()," ");
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());
        map = new int[R][C];
        int result = 0;
        ArrayList<int[]> dustList = new ArrayList<>();

        for(int i=0; i<R; i++){
            st = new StringTokenizer(in.readLine()," ");
            for(int j=0; j<C; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == -1){
                    cleanerX.add(i);
                }
            }
        }
        for(int i=0; i<T; i++) {
            dustList = findDust();
            spreading(dustList);
            onCleaner();
        }

        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if(map[i][j] > 0)   result += map[i][j];
            }
        }
        System.out.println(result);
    }
}

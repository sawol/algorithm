package BOJ.웹엑스수업;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_15683 {
    static int N;
    static int M;
    static int[][] map;
    static int[] dx = {0, 0, 1, -1};    // 오른쪽 왼쪽 위 아래
    static int[] dy = {1, -1, 0, 0};
    static ArrayList<CCTV> cctvList = new ArrayList<>();
    static int cctvRotationNum;
    static int[] visited;
    static CCTV[] cctvOrder;

    class CCTV{
        int x, y;       // cctv 위치
        int type;       // cctv 종류
        int direction;  // 현재 방향

        public CCTV(int x, int y, int type, int direction) {
            this.x = x;
            this.y = y;
            this.type = type;
            this.direction = direction;
        }

        public void rotation(int cctvType, int cctvX, int cctvY){            // 90도로 회전
            switch (type){
                case 1:
                case 2:
                case 3:
                case 4:

                case 5:
                    return;             // 5번 cctv는 회전 해도 항상 같음
            }

            BOJ_15683.map[1][2] = 1;
        }
    }

    private static void permutation(int cnt){              // cctv 순열 구하기(돌리는 순서)
        if (cnt == cctvRotationNum){
            System.out.println(Arrays.toString(cctvOrder));
            return;
        }

        for(int i=0; i<cctvList.size(); i++){
            if(cctvList.get(i).type == 5){
                if(visited[i] > 0) continue;           // 5번 타입의 cctv는 한번만 방문 가능
            }else if(cctvList.get(i).type == 2){
                if(visited[i] > 1) continue;            // 2번 타입의 cctv는 두번만 방문 가능
            }else{
                if(visited[i] > 3) continue;            // 나머지 타입의 cctv는 네번 방문 가능
            }
            visited[i]++;
            cctvOrder[cnt] = cctvList.get(i);
            permutation(cnt+1);
            visited[i]--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                map[i][j] = sc.nextInt();
//                cctvList.add(new CCTV(i,j,map[i][j],0));
                switch (map[i][j]) {
                    case 0:
                    case 6:
                        break;
                    case 1:
                    case 3:
                    case 4:             // cctv를 3번 돌릴 수 있음
                        cctvRotationNum += 4;
                        break;
                    case 2:             // cctv를 1번 돌릴 수 있음
                        cctvRotationNum += 2;
                        break;
                    case 5:             // cctv를 0번 돌릴 수 있음
                        cctvRotationNum += 1;
                        break;
                }
            }
        }

        visited = new int[cctvList.size()];
        cctvOrder = new CCTV[cctvRotationNum];
        permutation(0);
    }
}

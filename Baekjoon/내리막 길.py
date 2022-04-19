import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
​
// 각 지점을 객체로 생성하기
class Point implements Comparable<Point>{
    int x;  // 세로 좌표
    int y;  // 가로 좌표
    int h;                  // 해당 지점의 높이
​
    // 생성자
    public Point(int x, int y, int h) {
        super();
        this.x = x;
        this.y = y;
        this.h = h;
    }
​
    @Override
    public int compareTo(Point o) {
        return o.h - h;
    }
}
​
public class Main {
    static int m;       // 맵의 세로 길이
    static int n;       // 맵의 가로 길이
    static int[][] map;     // 맵
    static boolean[][] visited;
    static int[][] count;   // x 위치까지 가는 경로의 수
    static int[] dx = {0,0,1,-1};   // 세로로 돼지가 갈 수 있는 곳
    static int[] dy = {1,-1,0,0};   // 가로로 돼지가 갈 수 있는 곳
​
​
    private static void bfs(Point p) {
        PriorityQueue<Point> queue = new PriorityQueue<>();
        queue.offer(p);
​
        while(!queue.isEmpty()) {
            Point q = queue.poll();
​
            for (int i = 0; i < 4; i++) {
                // 다음으로 돼지가 갈 수 있는 세로, 가로 좌표
                int nx = dx[i] + q.x;
                int ny = dy[i] + q.y;
​
                if (nx >= 0 && ny >= 0 && nx < m && ny < n && map[nx][ny] < q.h) {
                    count[nx][ny] += count[q.x][q.y];
                    // 세로, 가로 좌표가 맵 범위 내이고, 돼지가 아직 방문하지 않은 위치중 내리막길인 경우
                    if (!visited[nx][ny]) {
                        // 해당 위치를 방문
                        visited[nx][ny] = true;
                        // 해당위치를 객체로 생성
                        queue.offer(new Point(nx, ny, map[nx][ny]));
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // 스트링토크나이저 생성
        StringTokenizer st = new StringTokenizer(in.readLine());
        // 세로 길이
        m = Integer.parseInt(st.nextToken());
        // 가로 길이
        n = Integer.parseInt(st.nextToken());
        // 맵
        map = new int[m][n];
        visited = new boolean[m][n];
        count = new int[m][n];
        // 맵 그리기
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(in.readLine());
            for(int j=0; j<n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 포인트 객체 생성
        Point p = new Point(0, 0, map[0][0]);
        count[0][0] = 1;
        // bfs 수행
        bfs(p);
​
        System.out.print(count[m-1][n-1]);
​
    }
}
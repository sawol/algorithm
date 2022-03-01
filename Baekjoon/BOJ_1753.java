package BOJ.웹엑스수업;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1753{
    static int V;
    static int E;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        V = Integer.parseInt(st.nextToken());                   // 총 정점의 수
        E = Integer.parseInt(st.nextToken());                   // 총 간선의 수
        int startV = Integer.parseInt(in.readLine());           // 시작 정점
        HashMap<Integer, Integer>[] map = new HashMap[V+1];

        for(int i=0; i<V+1; i++){
            HashMap<Integer,Integer> vw = new HashMap<>();
            map[i] = vw;
        }

        for(int i=0; i<E; i++){
            st = new StringTokenizer(in.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());           // u에서
            int v = Integer.parseInt(st.nextToken());           // v로 가는 간선
            int w = Integer.parseInt(st.nextToken());           // 가중치가 w
            if(map[u].get(v) != null){                          // 이미 가중치가 설정 되었다면
                map[u].put(v, Math.min(map[u].get(v), w));      // 가중치가 작은 값으로 업데이트
            }else {
                map[u].put(v, w);
            }
        }

        boolean[] visited = new boolean[V+1];                     // 방문 관리
        int[] distance = new int[V+1];                            // 출발점에서 인덱스 정점으로 이동하는데 최소 거리
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[startV] = 0;                                     // 시작점 거리 계산

        for(int i=0; i<V+1; i++){
            int min = Integer.MAX_VALUE;
            int current = 0;

            for(int j=0; j<V+1; j++){
                if(distance[j] < min && !visited[j]){           // 현재 정점에서 거리가 가장 작고 방문하지 않은 정점 선택
                    min = distance[j];
                    current = j;
                }
            }

            visited[current] = true;
            for(int key: map[current].keySet()){                // 현재 정점과 연결된 모든 정점을 돌기
                if(!visited[key] && distance[key] > distance[current] + map[current].get(key)){     // 선택된 정점을 경유해서 j로 가는것과 바로 j로 가는 방법중에 작은 값 선택
                    distance[key] = distance[current] + map[current].get(key);
                }
            }
        }
        for(int i=1; i<distance.length; i++) {
            if(distance[i] == Integer.MAX_VALUE){
                System.out.println("INF");
            }
            else {
                System.out.println(distance[i]);
            }
        }
    }
}

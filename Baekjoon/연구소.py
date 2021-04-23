import itertools
import collections
import copy

N, M = map(int, input().split())
map = [input().split() for _ in range(N)]
tmp = []
virus = []
result = 0

for i in range(N):
    for j in range(M):
        # 벽을 칠 수 있는 공간 찾기
        if map[i][j] == '0':
            tmp.append((i,j))
        # 바이러스 위치 저장
        elif map[i][j] == '2':
            virus.append((i,j))
            
# 3개의 벽 조합 모두 구하기
walls = list(itertools.combinations(tmp,3))

def bfs(x, y):
    if x < 0 or y < 0 or x >= N or y >= M or map_tmp[x][y] != '0':
        return
    queue.append((x,y))
    map_tmp[x][y] = '2'
    global safe
    safe -= 1

# 바이러스 퍼트리기
for wall in walls:
    map_tmp = copy.deepcopy(map)
    for h,w in wall:    
        map_tmp[h][w] = '1'     # 선택된 3개의 포인트에 벽치기
    # 안전한 곳의 수
    safe = len(tmp)
    queue = collections.deque(virus)
    discovered = [[False]*M for _ in range(N)]
    while queue:
        vh, vw = queue.popleft()
        if not discovered[vh][vw]:
            discovered[vh][vw] = True
            bfs(vh+1, vw)
            bfs(vh-1, vw)
            bfs(vh, vw+1)
            bfs(vh, vw-1)

    result = max(result, safe)
print(result-3)

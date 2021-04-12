import sys

sys.setrecursionlimit(10000)
T = int(input())
def dfs(field, i:int, j:int):
    # 밭의 범위에서 벗어나면 종료
    if i < 0 or j <0 or i >= N or j >= M or field[i][j] != 1:
        return
    # 이미 방문한 곳은 0으로 마킹
    field[i][j] = 0
    
    # 상하좌우 탐색
    dfs(field, i+1, j)
    dfs(field, i-1, j)
    dfs(field, i, j+1)
    dfs(field, i, j-1)
        
for _ in range(T):
    M, N, K = map(int, input().split())
    field = [[0]*M for _ in range(N)]
    cnt = 0
    for _ in range(K):            # 배추 위치 -> 그래프 그리기
        x, y = map(int, input().split())
        field[y][x] = 1
    for i in range(N):
        for j in range(M):
            if field[i][j] == 1:
                dfs(field, i, j)
                cnt += 1
                
    print(cnt)   

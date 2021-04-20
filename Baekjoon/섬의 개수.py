import sys

sys.setrecursionlimit(10**6)

def dfs(i,j):
    if i >= h or i < 0 or j >= w or j < 0 or graph[i][j] != 1:
        return
    
    graph[i][j] = 0
    # 가로, 새로, 대각선
    dfs(i+1,j)
    dfs(i+1,j+1)
    dfs(i+1,j-1)
    dfs(i,j+1)
    dfs(i,j-1)
    dfs(i-1,j)
    dfs(i-1,j+1)
    dfs(i-1,j-1)
    
while 1:
    w, h = map(int, input().split())
    if w == 0 and h == 0:
        break
    graph = [list(map(int, input().split())) for _ in range(h)]
    cnt = 0
    for i in range(h):
        for j in range(w):
            if graph[i][j] == 1:
                dfs(i,j)
                cnt += 1
    print(cnt)

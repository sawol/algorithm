import sys
sys.setrecursionlimit(100000)

def dfs(i,j):
    if i < 0 or j < 0 or i >= N or j >= N or graph[i][j] == 0:
        return
    if not discovered[i][j]:
        discovered[i][j] = True
        dfs(i+1,j)
        dfs(i-1,j)
        dfs(i,j+1)
        dfs(i,j-1)

N = int(input())
graph = [list(map(int, input().split())) for _ in range(N)]
max_value = max(max(i) for i in graph)
result = 0
for rain in range(max_value):
    cnt = 0
    discovered = [[False]*N for _ in range(N)]
    for i in range(N):
        for j in range(N):
            if graph[i][j] <= rain: 
                graph[i][j] = 0
    for p in range(N):
        for q in range(N):
            if graph[p][q] != 0 and not discovered[p][q]:
                dfs(p,q)
                cnt += 1
    result = max(result, cnt)
print(result)         

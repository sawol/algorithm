import collections
import sys
sys.setrecursionlimit(10000)

N, M = map(int, sys.stdin.readline().split())
graph = collections.defaultdict(list)
discovered=[]
for _ in range(M):
    a, b = map(int, sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)
    
def recursive_dfs(v):
    discovered.append(v)
    for w in graph[v]:
        if not w in discovered:
            recursive_dfs(w)
    return discovered

cnt = 0
for i in range(1, N+1):
    if not i in discovered:
        recursive_dfs(i)
        cnt += 1
print(cnt)

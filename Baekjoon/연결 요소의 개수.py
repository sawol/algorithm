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
    
def stack_dfs(v):
    stack = [v]
    while stack:
        w = stack.pop()
        if not w in discovered:
            discovered.append(w)
            for x in graph[w]:
                stack.append(x)

cnt = 0
for i in range(1, N+1):
    if not i in discovered:
        stack_dfs(i)
        cnt += 1
print(cnt)

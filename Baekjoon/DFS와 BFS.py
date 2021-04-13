import collections
graph = collections.defaultdict(list)
N, M, V = map(int, input().split())

for _ in range(M):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

def dfs(v, discovered=[]):
    stack = [v]
    while stack:
        x = stack.pop()
        if not x in discovered:
            discovered.append(x)
            for i in sorted(graph[x], reverse = True):
                stack.append(i)
    return discovered

def bfs(v):
    discovered = [v]
    queue = [v]
    while queue:
        x = queue.pop(0)
        for w in sorted(graph[x]):
            if not w in discovered:
                queue.append(w)
                discovered.append(w)
    return discovered
  
print(' '.join(list(map(str,dfs(V))))) 
print(' '.join(list(map(str,bfs(V)))))

import collections

num_com = int(input())
num_coms = int(input())
graph = collections.defaultdict(list)
for _ in range(num_coms):
    com_a, com_b = map(int, input().split())
    graph[com_a].append(com_b)
    graph[com_b].append(com_a)
  
def recursive_dfs(v, discovered=[]):
    discovered.append(v)
    for w in graph[v]:
        if not w in discovered:
            recursive_dfs(w, discovered)
    return len(discovered)
print(recursive_dfs(1)-1)

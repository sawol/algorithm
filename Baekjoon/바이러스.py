import collections

num_com = int(input())
num_coms = int(input())
graph = collections.defaultdict(list)
for _ in range(num_coms):
    com_a, com_b = map(int, input().split())
    graph[com_a].append(com_b)
    graph[com_b].append(com_a)
  
def stack_dfs(v):
    discovered = []
    stack = [v]
    while stack:
        x = stack.pop()
        if not x in discovered:
            discovered.append(x)
            for w in graph[x]:
                stack.append(w)
    return len(discovered)
print(stack_dfs(1)-1)

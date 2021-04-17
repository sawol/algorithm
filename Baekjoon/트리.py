N = int(input())
nodes = list(map(int, input().split()))
del_node = int(input())
cnt = 0
def dfs(n, arr):
    arr[n] = None
    for i, node in enumerate(arr):
        if node == n:
            dfs(i, arr)

dfs(del_node, nodes)
for i, node in enumerate(nodes):
    if node != None and i not in nodes:
        cnt += 1
print(cnt)

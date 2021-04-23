import collections

def tomato(h,w):
    if h < 0 or w < 0 or h >= N or w >= M or graph[h][w] == '-1' or graph[h][w] == '1':
        return
    graph[h][w] = '1'
    queue.append((h,w,cnt+1))
    global tomatos
    tomatos -= 1

M, N = map(int, input().split())
graph = [input().split() for _ in range(N)]    # [[str]]
discovered = [[False]*M for _ in range(N)]    # [[bool]]
queue = collections.deque([])
tomatos = 0
for i in range(N):
    for j in range(M):
        if graph[i][j] == '1':
            queue.append((i,j,0))
        elif graph[i][j] == '0':
            tomatos += 1
        
while queue:
    tomato_h, tomato_w, cnt = queue.popleft()
    if not discovered[tomato_h][tomato_w]:
        discovered[tomato_h][tomato_w] = True
        tomato(tomato_h+1, tomato_w)
        tomato(tomato_h-1, tomato_w)
        tomato(tomato_h, tomato_w+1)
        tomato(tomato_h, tomato_w-1)
if tomatos:
    print(-1)
else:
    print(cnt)

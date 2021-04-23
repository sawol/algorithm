import collections
def add(x,y,cnt):
    if x < 0 or y < 0 or x >= l or y >= l:
        return
    queue.append((x,y,cnt+1))
 
def bfs(cx,cy):
    cnt = 0
    while queue:
        x, y, cnt = queue.popleft()
        if (x,y) == (ax,ay):
                return cnt
        if discovered[y][x] == 0:
            discovered[y][x] = 1
            add(x+2, y+1, cnt)
            add(x+2, y-1, cnt)
            add(x+1, y+2, cnt)
            add(x-1, y+2, cnt)
            add(x-2, y+1, cnt)
            add(x-2, y-1, cnt)
            add(x-1, y-2, cnt)
            add(x+1, y-2, cnt)

for _ in range(int(input())):
    l = int(input())
    cx, cy = map(int, input().split())
    ax, ay = map(int, input().split())
    discovered = [[0]*l for _ in range(l)]
    queue = collections.deque([(cx,cy,0)])
    print(bfs(cx,cy))
    

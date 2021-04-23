import collections

N,M = map(int, input().split())
graph = [list(input()) for _ in range(N)]
discovered = [[0]*M for _ in range(N)]
queue = collections.deque([(0,0,1)])
graph[0][0] = 0

def move(x,y,cnt):
    if x < 0 or y < 0 or x >= M or y >= N or graph[y][x] == '0':
        return
    graph[y][x] = 0
    queue.append((x,y,cnt+1))
        
def bfs(x,y):
    while queue:
        qx,qy,cnt = queue.popleft()
        # print(qx, qy)
        if qx == M-1 and qy == N-1:
            return cnt
        if discovered[qy][qx] == 0:
            discovered[qy][qx] = 1
            move(qx+1,qy,cnt)
            move(qx,qy+1,cnt)
            move(qx-1,qy,cnt)
            move(qx,qy-1,cnt)            

print(bfs(0,0))

from collections import deque

def solution(maps):
    q = deque([(0,0,1)])    # x,y,cnt

    while q:
        x, y, cnt = q.popleft()
        if maps[x][y] == 1:
            if x == len(maps)-1 and y == len(maps[0])-1:
                return cnt
            maps[x][y] = 0
            if x+1 < len(maps): q.append((x+1,y,cnt+1))
            if x-1 >= 0: q.append((x-1,y,cnt+1))
            if y+1 < len(maps[0]): q.append((x,y+1,cnt+1))
            if y-1 >= 0: q.append((x,y-1,cnt+1))

    return -1

import collections
N, K = map(int, input().split())

def front(x):
    if x < 0 or x > 100000:
        return
    queue.append((x, cnt+1))

def back(x):
    if x < 0 or x > 100000:
        return
    queue.append((x, cnt+1))

def tele(x):
    if x < 0 or x > 100000:
        return
    queue.append((x, cnt+1))

def bfs(x):
    # print(x)
    front(x+1)
    back(x-1)
    tele(2*x)

queue = collections.deque([(N,0)])
discovered = [False]*100001
while queue: 
    q, cnt = queue.popleft()
    if q == K:
        print(cnt)
        break
    if not discovered[q]:
        discovered[q] = True
        bfs(q)

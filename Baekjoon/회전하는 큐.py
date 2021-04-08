import collections

N, M = map(int, input().split())
d = collections.deque(range(1,N+1))
select = list(map(int, input().split()))
cnt = 0

for idx in select:
    while 1:
        if idx == d[0]:
            d.popleft()
            break
        elif d.index(idx) <= len(d)//2:
            d.rotate(-1)
            cnt += 1
        else:
            d.rotate(1)
            cnt += 1
print(cnt)  

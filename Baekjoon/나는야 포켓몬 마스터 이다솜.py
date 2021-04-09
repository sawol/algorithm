import sys
import collections

N, M = map(int, sys.stdin.readline().split())
d_1 = collections.defaultdict(str)
d_2 = collections.defaultdict(str)
for i in range(1, N+1):
    x = sys.stdin.readline().strip()
    d_1[x] = i
    d_2[i] = x
    
for _ in range(M):
    x = sys.stdin.readline().strip()
    if x.isdecimal():
        print(d_2[int(x)])
    else:
        print(d_1[x])

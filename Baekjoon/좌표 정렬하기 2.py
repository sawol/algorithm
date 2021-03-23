import sys
​
N = int(input())
point_yx = []
​
​
for _ in range(N):
    x, y = map(int, sys.stdin.readline().split())
    point_yx.append([y, x])
​
sorted_yx = sorted(point_yx)
​
for i in sorted_yx:
    print(i[1],i[0])
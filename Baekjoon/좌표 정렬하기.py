import sys
​
N = int(input())
point_xy = []
​
​
for _ in range(N):
    x, y = map(int, sys.stdin.readline().split())
    point_xy.append([x, y])
​
sorted_xy = sorted(point_xy)
​
for i in sorted_xy:
    print(i[0],i[1])
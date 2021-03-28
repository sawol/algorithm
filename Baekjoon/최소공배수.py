import math
import sys
​
N = int(input())
for _ in range(N):
    a, b = map(int, sys.stdin.readline().split())
    print(math.lcm(a,b))
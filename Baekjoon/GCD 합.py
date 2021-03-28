import sys
import math
import itertools
​
t = int(input())
for _ in range(t):
    _, *arr = map(int, sys.stdin.readline().split())
    comb = list(itertools.combinations(arr,2))
    print(sum(math.gcd(i[0], i[1]) for i in comb))
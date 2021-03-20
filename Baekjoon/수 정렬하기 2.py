import sys
​
N = int(input())
s = list(map(int,sys.stdin.readlines()))
s.sort()
for i in s: print(i)
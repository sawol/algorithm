import sys
input = sys.stdin.readline
N = int(input())
A = set(input().split())
M = int(input())
result = ''
for i in input().split():
    result += '1\n' if i in A else '0\n'
print(result)

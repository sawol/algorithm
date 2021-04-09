import collections

hash = collections.defaultdict(int)
N = int(input())
s:list = list(map(int, input().split()))
M = int(input())
j:list = list(map(int, input().split()))

for char in s:
    hash[char] += 1

for char in j:
    print(hash[char], end=' ')

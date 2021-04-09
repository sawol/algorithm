import collections

N = int(input())
hash = collections.Counter(list(map(int, input().split())))
M = int(input())
j:list = list(map(int, input().split()))

for char in j:
    print(hash[char], end=' ')

hash = {}
N = int(input())
s:list = list(map(int, input().split()))
M = int(input())
j:list = list(map(int, input().split()))

for char in s:
    if char in hash:
        hash[char] += 1
    else:
        hash[char] = 1

for char in j:
    if char in hash:
        print(hash[char], end=' ')
    else:
        print(0, end=' ')

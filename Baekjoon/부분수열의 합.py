from itertools import combinations

N, S = map(int, input().split())
arr = list(map(int, input().split()))
cnt = 0
for i in range(1, N+1):
    for j in combinations(arr,i):
        if j and S == sum(j):
            cnt += 1
print(cnt)   

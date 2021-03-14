N = int(input())
arr = [int(i) for i in input().split()]
dp1 = [1]*N
dp2 = [1]*N
​
for x in range(1, N):
    for y in range(x):
        if arr[x] > arr[y]:
            dp1[x] = max(dp1[x], dp1[y]+1)
​
for p in range(N-1, -1, -1):
    for q in range(N-1, p, -1):
        if arr[p] > arr[q]:
            dp2[p] = max(dp2[p], dp2[q]+1)
​
print(max([dp1[i]+dp2[i]-1 for i in range(N)]))
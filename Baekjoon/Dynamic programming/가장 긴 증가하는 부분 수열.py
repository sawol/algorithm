N = int(input())
arr = [int(i) for i in input().split()]
dp = [1]*N
for p in range(1, N):
    for q in range(p):
        if arr[p] > arr[q]:
            dp[p] = max(dp[p], dp[q]+1)
print(max(dp))
T = int(input())
dp = [0]*101
dp[1:5] = [1, 1, 1, 2]
​
for _ in range(T):
    N = int(input())
    for i in range(5, N+1):
        dp[i] = dp[i-1] + dp[i-5]
    print(dp[N])
  
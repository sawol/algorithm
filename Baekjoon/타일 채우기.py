N = int(input())
dp = [0] * 31
dp[2] = 3
​
for i in range(4, N+1, 2):
    dp[i] = 2 + dp[i-2]*dp[2] + sum(dp[:i-2])*2
print(dp[N])
T = int(input())
dp = [0]*101
dp[1:5] = [1, 1, 1, 2]
​
for i in range(5, 101):
    dp[i] = dp[i-1] + dp[i-5]
​
for _ in range(T):
    print(dp[int(input())])
​
​
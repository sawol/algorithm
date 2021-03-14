def dp():
    n = int(input())
    dp = [[int(i) for i in input().split()] for j in range(2)]
    dp[0][1] += dp[1][0]
    dp[1][1] += dp[0][0]
​
    for p in range(2, n):
        dp[0][p] += max(dp[1][p-2], dp[1][p-1])
        dp[1][p] += max(dp[0][p-2], dp[0][p-1])
​
    print(max(dp[0][n-1], dp[1][n-1]))
    
for q in range(int(input())):
    dp()
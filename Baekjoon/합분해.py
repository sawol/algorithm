N, k = map(int, input().split())
dp = [[0]*201 for _ in range(201)]
​
for i in range(201):
    dp[1][i] = 1
    dp[2][i] = i + 1
    
for p in range(2, 201):
    dp[p][1] = p
    for q in range(2, 201):
        dp[p][q] = dp[p][q-1] + dp[p-1][q]
    
print(dp[k][N]%1000000000)
import sys
​
n = int(input())
wine = [0]
wine += [int(sys.stdin.readline().strip()) for i in range(n)]
dp = [0, wine[1]]
​
if n > 1:
    dp.append(wine[1]+wine[2])
for j in range(3, n+1):
    case1 = dp[j-1]    # 현재 포도주를 마시지 않음
    case2 = dp[j-3] + wine[j] + wine[j-1]    # 이전 포도주 + 현재 포도주 마심
    case3 = dp[j-2] + wine[j]    # 이이전 포도주와 현재 포도주 마심
    dp.append(max(case1, case2, case3))
    
print(dp[n])
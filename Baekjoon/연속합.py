import sys 
​
N = int(input())
arr = [int(i) for i in sys.stdin.readline().split()]
dp = [0]*N
dp[0] = arr[0]
​
for x in range(1, N):
    dp[x] = max(arr[x], arr[x] + dp[x-1])
        
print(max(dp))
N = int(input()) 
dp = [i for i in range(0, N+1)]
squared = [i*i for i in range(2, int(N**0.5)+1)]
​
for p in range(N+1):
    for q in squared:
        if q > p:
          break
        if dp[p] > dp[p-q]+1:
            dp[p] = dp[p-q]+1
        else:
            dp[p] = dp[p]
        
print(dp[-1])
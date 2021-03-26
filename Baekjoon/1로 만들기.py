def dp(n):
    if n in buf:
        return buf[n]
        
    m = 1 + min(dp(n // 2) + n % 2, dp(n // 3) + n % 3)
    buf[n] = m
    return m
​
buf = {1: 0, 2: 1}
n = int(input())
print(dp(n))
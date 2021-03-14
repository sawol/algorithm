N = int(input())
dp = [1] * 10
​
for _ in range(N-1):
    dp = [sum(dp[:i+1])%10007 for i in range(10)]
    
print(sum(dp)%10007)
# 추가한 코드입니다.
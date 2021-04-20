N, K = map(int, input().split())
coins = [int(input()) for _ in range(N)]
cnt = 0
for coin in coins[::-1]:
    if K//coin > 0:
        cnt += K//coin
        K %= coin
        if K == 0:
            break
print(cnt)

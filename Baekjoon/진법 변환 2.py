N, B = map(int, input().split())
value = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
result = ''
while N:
    result += value[N%B]
    N //= B
print(result[::-1])
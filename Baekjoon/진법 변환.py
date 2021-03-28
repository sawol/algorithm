N, B = input().split()
B = int(B)
value = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
result = 0
for i, v in enumerate(N[::-1]):
    result += value.index(v)*B**i
    
print(result)
N = int(input())
atm = list(map(int, input().split()))
tmp, result = 0, 0

for i in sorted(atm):
    tmp += i
    result += tmp
print(result)

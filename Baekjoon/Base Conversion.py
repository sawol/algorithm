A, B = map(int, input().split())
m = int(input())
v = list(map(int, input().split()))
result = 0
answer = []
for idx, number in enumerate(v[::-1]):
    result += number*(A**(idx))
while result:
    result, r = divmod(result, B)
    answer.append(str(r))
print(' '.join(answer[::-1]))
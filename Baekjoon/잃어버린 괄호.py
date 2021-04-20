expression = input().split('-')
result = 0
for i, v in enumerate(expression):
    if i == 0:
        v = list(map(int, v.split('+')))
        result += sum(v)
    else:
        v = list(map(int, v.split('+')))
        result -= sum(v)
print(result)

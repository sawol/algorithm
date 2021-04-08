n = int(input())
stack = []
temp = 1
result = ''
for i in range(1, n+1):
    target = int(input())
    while temp <= target:
        stack.append(temp)
        temp += 1
        result += '+'
    if stack[-1] == target:
        stack.pop()
        result += '-'
    else:
        print('NO')
        exit()
for i in result:
    print(i)

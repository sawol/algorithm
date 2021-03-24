import sys
​
T = int(input())
​
for _ in range(T):
    stack = []
    arr = list(sys.stdin.readline())
    for i in range(len(arr)):
        if arr[i] == '(':
            stack.append(i)
        elif arr[i] == ')' and stack:
            stack.pop()
        elif arr[i] == ')' and not stack:
            print('NO')
            break
        elif i == len(arr)-1 and stack:
            print('NO')
        elif i == len(arr)-1 and not stack:
            print('YES')
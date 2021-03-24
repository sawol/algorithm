arr = list(input())
stack = []
num = 0
​
for i in range(len(arr)):
    if arr[i] == '(':
        stack.append('(')
    else: 
        if arr[i-1] == '(':
            stack.pop()
            num += len(stack)
        else:
            stack.pop()
            num += 1
​
print(num)
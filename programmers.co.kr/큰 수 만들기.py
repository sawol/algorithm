def solution(number, k):
    stack = []
    
    for i in number:
        while stack and stack[-1] < i and k:
            stack.pop()
            k -= 1
        stack.append(i)
    if k:
        stack = stack[:-k]
    return ''.join(stack)

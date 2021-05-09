def corret(s):
    stack = []
    for i in s:
        if not stack or i == '(':
            stack.append(i)
        elif i == ')' and stack[-1] == '(':
            stack.pop()
    if not stack:
        return True
    else:
        return False

def reverse(s):
    result = ''
    for i in s:
        if i == '(':
            result += ')'
        elif i == ')':
            result += '('
    return result


def solution(p):
    l,r = 0, 0
    if not p:
        return p
    for i,v in enumerate(p):
        if v == '(':
            l += 1
        else:
            r += 1
        if l == r:
            u,v = p[:i+1], p[i+1:]
            if corret(u):
                return u + solution(v)
            else:
                answer = '(' + solution(v) + ')' + reverse(u[1:-1])    
                return answer

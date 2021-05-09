import collections

def solution(s):
    answer = 0
    q = collections.deque(s)
    for _ in range(len(s)):
        stack = []
        for i in q:
            if not stack:
                stack.append(i)
            elif i == ']'and stack[-1] == '[':
                stack.pop()
            elif i == ')'and stack[-1] == '(':
                stack.pop()
            elif i == '}'and stack[-1] == '{':
                stack.pop()
            elif i in '[{(':
                stack.append(i)
            else:
                break
        if not stack:
            answer += 1
        q.rotate(1)
    return answer

from collections import deque

def solution(priorities, location):   
    q = deque(priorities)
    answer = 0
    while True:
        if len(q) == 1:
            return answer + 1
        doc = q.popleft()
        if doc < max(q):
            q.append(doc)
            if location:
                location -= 1
            else:
                location += len(q)-1
            continue
        else:
            answer += 1
            if location:
                location -= 1
            else:
                return answer

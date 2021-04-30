import math
def solution(progresses, speeds):
    answer = []
    tmp = [math.ceil((100 - a) / b) for a,b in zip(progresses, speeds)]
    cnt = 0
    
    top = tmp[0]
    while tmp:
        t = tmp.pop(0)
        if t > top:
            answer.append(cnt)
            top = t
            cnt = 1
        else:
            cnt += 1
        if not tmp:
            answer.append(cnt)
    return answer

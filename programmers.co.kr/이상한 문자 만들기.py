def solution(s):
    answer = []
    s = s.lower().split(' ')
    for i in s:
        tmp = ''
        for j,v in enumerate(i):
            if (j+1)%2:
                tmp += v.upper()
            else:
                tmp += v
        answer.append(tmp)
    return ' '.join(answer)

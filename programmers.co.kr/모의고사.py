def solution(answers):
    solv = [0,0,0]
    f, s, t = list(range(1,6))*2000, [2,1,2,3,2,4,2,5]*(10000//8+1), [3,3,1,1,2,2,4,4,5,5]*1000
    tmp = list(zip(f,s,t))
    for i,v in enumerate(answers):
        for j,w in enumerate(tmp[i]):
            if w == v:
                solv[j] += 1
    answer = [i+1 for i,v in enumerate(solv) if v == max(solv)]

    return answer

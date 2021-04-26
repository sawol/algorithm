def solution(d, budget):
    answer, m = 0, 0
    d.sort()
    for i in d:
        if m + i <= budget:
            m += i
            answer += 1
    return answer

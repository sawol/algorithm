def solution(n, lost, reserve):
    real_lost = set(lost) - set(reserve)
    real_reserve = set(reserve) - set(lost)
    answer = n-len(real_lost)
    for i in sorted(real_lost):
        if i+1 in real_reserve:
            real_reserve.remove(i+1)
            answer += 1
        elif i-1 in real_reserve:
            real_reserve.remove(i-1)
            answer += 1
    return answer

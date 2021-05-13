def solution(name):
    if set(name) == {'A'}:
        return 0
    tmp = [min(ord(i) - ord('A'), ord('Z')+1 - ord(i)) for i in name]
    answer = sum(tmp)
    idx = 0
    while True:
        tmp[idx] = 0
        if not sum(tmp):
            return answer
        left, right = -1, 1
        while tmp[idx+right] == 0:
            right += 1
        while tmp[idx+left] == 0:
            left -= 1
        answer += -left if right > -left else right
        idx += left if right > -left else right

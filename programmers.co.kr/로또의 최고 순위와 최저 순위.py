def solution(lottos, win_nums):
    hits, zn = len([i for i in win_nums if i in lottos]), lottos.count(0)
    return [7 - zn-hits if hits+zn else 6, 7-hits if hits else 6]

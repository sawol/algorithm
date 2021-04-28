def solution(n):
    tmp = '124'
    q,r = divmod(n-1,3)
    if q == 0:
        return tmp[r]
    else:
        return solution(q) + tmp[r]

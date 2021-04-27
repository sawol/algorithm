import itertools
def solution(n):
    answer = itertools.cycle('수박')
    return ''.join([next(answer) for _ in range(n)])

import itertools
import collections

def solution(orders, course):
    answer = []
    for c in course:
        cases = []
        for o in orders:
            for i in itertools.combinations(o,c):
                cases.append(''.join(sorted(''.join(i))))
        x = collections.Counter(cases)
        if x:
            big_cnt = max(x.values())
        for v, n in x.items():
            if n == big_cnt and n > 1:
                answer.append(''.join(v))
    return sorted(answer)

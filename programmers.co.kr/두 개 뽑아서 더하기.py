import itertools

def solution(numbers):
    return sorted(list(set([a+b for a, b in itertools.combinations(numbers,2)])))

import collections
import functools

def solution(clothes):
    a = collections.Counter([k for v, k in clothes])
    b = list(map(lambda x: x+1, dict(a).values()))
    answer = functools.reduce(lambda x,y: x*y,b,1)-1
    return answer

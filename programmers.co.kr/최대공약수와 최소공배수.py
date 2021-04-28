def solution(n, m):
    lcm = n*m
    while m:
        n,m = m,n%m
    return n, lcm//n

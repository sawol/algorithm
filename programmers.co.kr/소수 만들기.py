import itertools

def solution(nums):
    dp = [False] * 3000
    for i in range(2,3000):
        for j in range(2*i,3000,i):
            dp[j] = True
    return len([dp[sum(i)] for i in itertools.combinations(nums,3) if not dp[sum(i)]])

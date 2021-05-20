def solution(citations):
    citations.sort(reverse=True)
    for i in range(len(citations),0,-1):
        if list(map(lambda x: x>=i, citations[:i])).count(True) == i:
            return i
    return 0

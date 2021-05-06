import heapq

def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville)
    while scoville[0] < K:
        if len(scoville) > 1:
            f,s = heapq.heappop(scoville), heapq.heappop(scoville)
            heapq.heappush(scoville, f+s*2)
            answer += 1
        else:
            return -1
    return answer

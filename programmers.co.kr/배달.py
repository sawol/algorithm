import collections 

def solution(N, road, K):
    dist = [0,0]+[float('INF')]*(N-1)
    graph = collections.defaultdict(list)
    for n1,n2,t in road:
        graph[n1].append((n2,t))
        graph[n2].append((n1,t))        
    queue = collections.deque([1])
    while queue:
        n= queue.popleft()
        for wn,wt in graph[n]:
            if dist[wn] > dist[n]+wt:
                dist[wn] = dist[n]+wt
                queue.append(wn)
    return len([d for d in dist if d <= K])-1

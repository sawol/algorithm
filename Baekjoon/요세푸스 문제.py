N, K = map(int, input().split())
circular = [str(i+1) for i in range(N)]
idx = 0
result = []
for t in range(N):
    idx += K-1
    idx %= len(circular)
    result.append(circular.pop(idx))
print('<', ', '.join(result), '>', sep='')
​
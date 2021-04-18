N, M = map(int, input().split())
height = list(map(int, input().split()))
start, end, result = 0, max(height), 0
while start <= end:
    mid = start + (end-start)//2
    tree = sum([i-mid for i in height if i >= mid])
    if M > tree:
        end = mid - 1
    else:
        result = max(result, mid)
        start = mid + 1
print(result)

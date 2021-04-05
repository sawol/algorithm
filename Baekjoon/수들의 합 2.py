N, M = map(int, input().split())
arr = list(map(int, input().split()))
start, end = 0, 1
cnt = 0

while start <= N and end <= N:
    if sum(arr[start:end]) == M:
        cnt += 1
        start += 1
        end += 1
    elif sum(arr[start:end]) > M:
        start += 1
    else:
        end += 1

print(cnt)        
        

N, S = map(int, input().split())
arr = list(map(int, input().split()))

sum_arr = [0] * (N+1)
for i in range(1, N+1):
    sum_arr[i] = sum_arr[i-1] + arr[i-1]
    
start, end = 0, 1
answer = 100001

while start < N and end <= N:
    if sum_arr[end] - sum_arr[start] >= S:
        answer = min(answer, end-start)
        start += 1
    else:
        end += 1
        
if answer == 100001:
    print(0)
else:
    print(answer)

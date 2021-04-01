left, right = 0, int(input()) - 1
arr = sorted(list(map(int, input().split())))
x = int(input())
cnt = 0
while left != right:
    if arr[left] + arr[right] > x:
        right -= 1
    elif arr[left] + arr[right] == x:
        cnt += 1
        right -= 1
    elif arr[left] + arr[right] < x:
        left += 1
print(cnt)

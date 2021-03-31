s = input().split(',')
cnt = 0
for i in s:
    if i.isdigit():
        cnt += 1
print(cnt)
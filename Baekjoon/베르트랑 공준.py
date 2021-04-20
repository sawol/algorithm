arr = [False, False]+[True]*123456*2
for idx, v in enumerate(arr):
    if v:
        for i in range(2*idx,len(arr),idx):
            arr[i] = False
while 1:
    s = int(input())
    if s == 0:
        break
    print(arr[s+1:2*s+1].count(True))

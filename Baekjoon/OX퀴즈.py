T = int(input())

for _ in range(T):
    point = 0
    s = input().split('X')
    for v in s:
        for i, j in enumerate(v):
            point += i+1     
    print(point)        

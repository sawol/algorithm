N, L = map(int, input().split())

for i in range(L, 101):
    x = (N/i -(i+1)/2)
    if x == int(x):
        if x < -1:
            break
        else:
            for j in range(1, i+1):
                print(int(x)+j, end = ' ')
            exit()
        
print(-1)

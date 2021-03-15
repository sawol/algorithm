cnt = int(input())
for i in range(1, cnt+1):
    print(' '*(cnt-i), end = '')
    for j in range(1, i):
        print('*', end = ' ')
    print('*')
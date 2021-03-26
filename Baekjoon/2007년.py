m, d = map(int, input().split())
week = ['MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT', 'SUN']
for i in range(1, m):
    if i == 2:
        d += 28
    elif i == 4 or i == 6 or i == 9 or i == 11:
        d += 30
    elif m == 1:
        pass
    else:
        d += 31
        
print(week[d%7-1])
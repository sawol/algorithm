suga = int(input())
x = suga//3 # 3킬로 최대 봉투 개수
y = suga//5 # 5카로 최대 봉투 개수
tmp = []
for i in range(y+1):
    for j in range(x+1):
        if suga == 3*j+5*i:
            tmp.append(i+j)
if not tmp:
    print(-1)
else:
    print(min(tmp))
import sys
from operator import itemgetter
​
N = int(input())
result = []
​
for _ in range(N):
    name, kor, eng, math  = sys.stdin.readline().split()
    result.append([name, 100-int(kor), int(eng), 100-int(math)])
​
result.sort(key = itemgetter(1,2,3,0))
​
for i in result:
    print(i[0])
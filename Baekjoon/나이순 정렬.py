import sys
from operator import itemgetter
​
​
N = int(input())
member = []
​
for _ in range(N):
    age, name = sys.stdin.readline().split()
    member.append([int(age), name])
​
sorted_mem = sorted(member, key=itemgetter(0))
​
for i in sorted_mem:
    print(i[0],i[1])
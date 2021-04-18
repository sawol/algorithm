import collections
N = int(input())
A = list(map(int, input().split()))
B = sorted(list(map(int, input().split())), reverse=True)
A_sort = sorted(A)
tmp = collections.defaultdict(list)
for i in range(N):
    tmp[A_sort[i]].append(B[i])
result = sum([tmp[i].pop()*i for i in A])
print(result)

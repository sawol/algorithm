N = int(input())
tmp = list(set([input() for _ in range(N)]))
for i in sorted(sorted(tmp), key=lambda x: len(x)):
    print(i)

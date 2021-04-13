import itertools
result = list(itertools.permutations(list(range(1, int(input())+1))))
for i in result:
    for j in i:
        print(j, end=' ')
    print()

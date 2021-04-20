import itertools
while 1:
    k, *arr = input().split()
    if not arr:
        break
    result = itertools.combinations(arr, 6)
    for i in result:
        print(' '.join(i))
    print()

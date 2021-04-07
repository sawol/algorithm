import sys
arr = list(map(int, sys.stdin.readlines()))
print(max(arr), '\n'+str(arr.index(max(arr))+1))

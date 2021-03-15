import sys
_, *m = map(int, sys.stdin.read().split())
print(min(m), max(m))
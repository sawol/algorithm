import sys

A, B, C = map(int, input().split())
if B >= C:
    print(-1)
    sys.exit()
print(A//(C-B) + 1)

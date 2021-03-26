import sys
​
s = list(input().strip())
s1 = []
N = int(input())
for _ in range(N):
    cmd = sys.stdin.readline().split()
    if cmd[0] == 'L':
        if s: s1.append(s.pop())
    elif cmd[0] == 'D':
        if s1: s.append(s1.pop())
    elif cmd[0] == 'B':
        if s: s.pop()
    else:
        s.append(cmd[1])
print(''.join(s+list(reversed(s1))))
from collections import deque
import sys

while 1:
    deq: list = deque(sys.stdin.readline().strip())
    if deq[0] == '0':
        break
    if len(deq) == 1:
           print('yes')
           continue
    while len(deq) > 1:
        if deq.popleft() != deq.pop():
            print('no')
            break
        elif len(deq) <= 1:
            print('yes')

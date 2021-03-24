import sys
import collections
​
N = int(input())
deq = collections.deque()
​
for _ in range(N):
    command = sys.stdin.readline()
    if 'push_front' in command:
        deq.appendleft(command.split()[1])
    elif 'push_back' in command:
        deq.append(command.split()[1])
    elif 'pop_front' in command:
        if not deq:
            print(-1)
            continue
        print(deq.popleft())
    elif 'pop_back' in command:
        if not deq:
            print(-1)
            continue
        print(deq.pop())
    elif 'size' in command:
        print(len(deq))
    elif 'empty' in command:
        if deq:
            print(0)
        else:
            print(1)
    elif 'front' in command:
        if not deq:
            print(-1)
            continue
        print(deq[0])
    elif 'back' in command:
        if not deq:
            print(-1)
            continue
        print(deq[-1])
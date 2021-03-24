import sys
​
N = int(input())
arr = []
​
for _ in range(N):
    command = sys.stdin.readline()
    if 'push' in command:
        arr.append(command.split()[1])
    elif 'pop' in command:
        if not arr:
            print(-1)
            continue
        print(arr.pop())
    elif 'size' in command:
        print(len(arr))
    elif 'empty' in command:
        if arr:
            print(0)
        else:
            print(1)
    elif 'top' in command:
        if not arr:
            print(-1)
            continue
        print(arr[-1])
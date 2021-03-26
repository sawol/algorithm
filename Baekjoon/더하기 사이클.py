import sys
​
A = int(sys.stdin.readline())
A1 = A
num = 0
while 1:
    if A < 10:
        a, b = 0, A%10
    else:
        a, b = A//10, A%10
​
    c = a + b
    A = b*10 + c%10
    num += 1
    if A == A1:
        break
print(num)
​
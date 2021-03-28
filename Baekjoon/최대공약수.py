import math
​
a, b = map(int, input().split())
for _ in range(math.gcd(a,b)): print(1, end='')
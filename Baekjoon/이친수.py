N = int(input())
x, y = 0, 1
​
for _ in range(1, N):
    x, y = x+y, x
    
print(x+y)
fibo = [[1,0], [0,1]] + [[]]*39
for i in range(2, 41):
    fibo[i] = [fibo[i-1][j] + fibo[i-2][j] for j in range(2)] 
    
T = int(input())
for _ in range(T):
    N = int(input())
    z, o = fibo[N]
    print(z, o)

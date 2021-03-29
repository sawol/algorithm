import math
​
N = int(input())
arr = [i for i in range(1001)]
arr[0], arr[1] = False, False
num_list = list(map(int, input().split()))
for i in range(2, int(math.sqrt(1000))+1):
    if arr[i] != False:
        j = 2
        while j*i <= 1000:
            arr[j*i] = False
            j += 1
            
print(len([i for i in num_list if arr[i]]))
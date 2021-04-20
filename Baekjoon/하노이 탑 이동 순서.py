N = int(input())
def hanoi(num,start,tmp,target):
    if num == 1:
        print(start,target)
    else:
        hanoi(num-1,start,target,tmp) # start(1번~n-1번) -> tmp
        print(start,target)           # start(n번) -> target
        hanoi(num-1,tmp,start,target) # tmp(1번~n-1번) -> target
print(2**N-1)
hanoi(N,1,2,3)

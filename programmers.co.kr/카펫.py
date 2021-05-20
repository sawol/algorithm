def solution(brown, yellow):
    for i in range(1,int((brown+yellow)**0.5+1)):
        if not (brown+yellow)%i:
            if (i-2) *((brown+yellow)//i-2) == yellow:
                return [(brown+yellow)//i,i]

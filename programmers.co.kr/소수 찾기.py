import itertools

def solution(numbers):
    numbers = sorted(numbers, reverse=True)
    number_list = []
    for i in range(1,len(numbers)+1):	# 조합 찾기
        nums = list(itertools.permutations(numbers,i))
        for num in nums:
            number_list.append(int(''.join(map(str,num))))
    max_number = int(''.join(numbers))
    prime = [False,False]+[True]*(max_number+1)
    for i in range(2, max_number+1):	# 소수 찾기
        if prime[i]:
            for j in range(2*i,max_number+1,i):
                prime[j] = False                
    answer = sum(1 for i in set(number_list) if prime[i])
    return answer

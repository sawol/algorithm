def solution(numbers):
    numbers = list(map(str, numbers))
    numbers = sorted(numbers, key=lambda x: (x[0],x[1%len(x)],x[2%len(x)],x[3%len(x)]) , reverse=True)
    return ''.join(numbers) if int(''.join(numbers)) != 0 else '0'

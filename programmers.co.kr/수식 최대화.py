import re
import itertools

def solution(expression):
    answer = 0
    o = re.compile('[-+*]')
    n = re.compile('\d+')
    op = o.findall(expression)
    num = list(map(int, n.findall(expression)))
    case_list = itertools.permutations(['-', '+', '*'], 3)
    for case in case_list:
        operator = op[:]
        numbers = num[:]
        for oper in case:
            while oper in operator:
                idx = operator.index(oper)
                if idx >= 0 and oper == '*':
                    v = numbers.pop(idx) * numbers.pop(idx)
                    numbers.insert(idx, v)
                    del operator[idx]
                if idx >= 0 and oper == '+':
                    v = numbers.pop(idx) + numbers.pop(idx)
                    numbers.insert(idx, v)
                    del operator[idx]
                if idx >= 0 and oper == '-':
                    v = numbers.pop(idx) - numbers.pop(idx)
                    numbers.insert(idx, v)
                    del operator[idx]
        answer = max(answer, abs(*numbers))

    return answer

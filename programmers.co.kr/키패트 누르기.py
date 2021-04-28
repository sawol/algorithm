def solution(numbers, hand):
    answer = ''
    r, l = [3,6,9], [1,4,7]
    cr, cl = 10, 12
    for i,v in enumerate(numbers):
        if v in r:
            answer += "R"
            cr = v
        elif v in l:
            answer += "L"
            cl = v
        else:
            if v == 0:
                v = 11
            if abs(cr - v)//3+abs(cr - v)%3 < abs(cl - v)//3+abs(cl - v)%3:
                answer += "R"
                cr = v
            elif abs(cr - v)//3+abs(cr - v)%3 > abs(cl - v)//3+abs(cl - v)%3:
                answer += "L"
                cl = v
            else:
                answer += hand[0].upper()
                if hand[0].upper() == 'L':
                    cl = v
                else:
                    cr = v
    return answer

import string
def solution(s, n):
    answer = ''
    alpha = string.ascii_lowercase
    for i in s:
        small_i = i.lower()
        if i != ' ':
            if i.isupper():
                answer += alpha[(alpha.index(small_i)+n)%len(alpha)].upper()
            else:
                answer += alpha[(alpha.index(small_i)+n)%len(alpha)]
        else:
            answer += ' '
    return answer

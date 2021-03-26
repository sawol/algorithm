import string
s = input()
alp = list(string.ascii_lowercase)
for i in s:
    if i.islower() == True: # 소문자라면
        idx = alp.index(i)
        if idx >= 13:
            idx -= 13
            print(alp[idx], end='')
        else:
            print(alp[idx+13], end='')
    elif i.isupper() == True: # 대문자라면
        idx = alp.index(i.lower())
        if idx >= 13:
            idx -= 13
            print(alp[idx].upper(), end='')
        else:
            print(alp[idx+13].upper(), end='')
    else:
        print(i, end='')
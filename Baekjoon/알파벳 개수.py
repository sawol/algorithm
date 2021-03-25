import string
arr = [0]*26
alp = list(string.ascii_lowercase)
s = input()
for i in range(26):
    print(s.count(alp[i]), end=' ')
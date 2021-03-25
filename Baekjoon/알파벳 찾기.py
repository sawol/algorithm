import string
arr = [-1]*26
alp = list(string.ascii_lowercase)
s = input()
for i in range(len(s)):
    arr[alp.index(s[i])] = s.index(s[i]) 
​
for p in arr:
    print(p, end = ' ')
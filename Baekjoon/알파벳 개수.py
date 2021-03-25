import string
arr = [0]*26
alp = list(string.ascii_lowercase)
s = input()
for i in s:
    arr[alp.index(i)] += 1
​
for p in arr:
  print(p, end = ' ')
​
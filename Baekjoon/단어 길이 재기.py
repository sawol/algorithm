import string
s = input().lower()
print(sum(i.islower() for i in s))
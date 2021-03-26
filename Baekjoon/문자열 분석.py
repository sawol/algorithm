import sys
import string
s_list = map(lambda x: x.strip('\n'),sys.stdin.readlines())
​
for s in s_list:
    print(sum(i.islower() for i in s), end =' ')
    print(sum(i.isupper() for i in s), end =' ')
    print(sum(i.isdigit() for i in s), end =' ')
    print(sum(i.isspace() for i in s))
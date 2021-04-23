import collections
s = input().upper()
v = collections.Counter(s).most_common(2)
if len(v) > 1 and v[0][1] == v[1][1]:
    print('?')
else:
    print(v[0][0])

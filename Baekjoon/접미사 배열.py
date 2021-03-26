s = input()
result = sorted([s[i:] for i in range(len(s))])
for p in result: print(p)
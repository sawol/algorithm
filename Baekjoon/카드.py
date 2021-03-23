import sys
from collections import Counter
​
N = int(input())
card = list(map(int, sys.stdin.readlines()))
cnt = Counter(sorted(card))
print(cnt.most_common(1)[0][0])
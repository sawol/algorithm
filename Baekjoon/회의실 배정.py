from operator import itemgetter

N = int(input())
tmp = [tuple(map(int, input().split())) for _ in range(N)]
tmp_s = sorted(tmp, key=itemgetter(1,0))
end_time, cnt = 0, 0
for s, e in tmp_s:
    if s >= end_time:
        cnt += 1
        end_time = e
print(cnt)

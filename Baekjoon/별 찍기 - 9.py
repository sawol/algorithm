cnt = int(input())
​
a = 0
for i in range(cnt*2-1, 0, -2):
  print(' '*a + '*'*i)
  a += 1
a = cnt - 2  
for i in range(3, cnt*2, 2):
  print(' '*a + '*'*i)
  a -= 1  
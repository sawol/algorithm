T = int(input())
     
for _ in range(T):
    M, N, K = map(int, input().split())
    field = [[0]*M for _ in range(N)]
    
    for _ in range(K):            # 배추 위치 -> 그래프 그리기
        x, y = map(int, input().split())
        field[y][x] = 1
    stack = []
    cnt = 0
    for i in range(N):
        for j in range(M):
            if field[i][j] == 1:
                stack.append((i,j))
                cnt += 1
                while stack:    # 상하좌우 탐색
                    x, y = stack.pop()
                    field[x][y] = 0
                    if x > 0 and field[x-1][y]: stack.append((x-1, y))
                    if x < N-1 and field[x+1][y]: stack.append((x+1, y))
                    if y > 0 and field[x][y-1]: stack.append((x, y-1))
                    if y < M-1 and field[x][y+1]: stack.append((x, y+1))
    print(cnt)    

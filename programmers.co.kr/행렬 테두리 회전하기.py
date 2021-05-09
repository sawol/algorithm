def solution(rows, columns, queries):
    answer = []
    graph = []
    for i in range(1, rows * columns + 1, columns):
        graph.append([j for j in range(i, i + columns)])

    for query in queries:
        x1, x2, y1, y2 = query
        tmp = []
        for i in range(x2-1,y2):
            tmp.append(graph[x1-1][i])
        for j in range(x1, y1):
            tmp.append(graph[j][y2-1])
        for p in range(y2-2,x2-2,-1):
            tmp.append(graph[y1-1][p])
        for q in range(y1-2,x1-1,-1):
            tmp.append(graph[q][x2-1])
        answer.append(min(tmp))
        tmp = tmp[-1:]+tmp[:-1]
        for i in range(x2-1,y2):
            graph[x1-1][i] = tmp.pop(0)
        for j in range(x1, y1):
            graph[j][y2-1] = tmp.pop(0)
        for p in range(y2-2,x2-2,-1):
            graph[y1-1][p] = tmp.pop(0)
        for q in range(y1-2,x1-1,-1):
            graph[q][x2-1] = tmp.pop(0)

    return answer

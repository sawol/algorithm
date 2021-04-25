def solution(board, moves):
    answer = 0
    stack, new_b = [], []
    y:int = len(board)
    for i in range(y):
        new_b.append([b[i] for b in board if b[i]])
    for move in moves:
        if new_b[move-1]:
            toy = new_b[move-1].pop(0)
            if stack and toy == stack[-1]:
                stack.pop()
                answer += 2
            else:
                stack.append(toy)
    return answer

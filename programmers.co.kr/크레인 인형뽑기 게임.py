def solution(board:list, moves:list) -> int:
    basket = []
    result = 0
    for move in moves:
        for i in range(0, len(board)):
            dolls = board[i]
            if dolls[move-1] == 0:
                pass
            else:
                basket.append(dolls[move-1])
                dolls[move-1] = 0
                if len(basket) > 1 and basket[-2] == basket[-1]:
                    basket.pop()
                    basket.pop()
                    result += 2
                    break
                else:
                    break
    return result

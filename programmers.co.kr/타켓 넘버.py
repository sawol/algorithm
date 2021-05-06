def solution(numbers, target):
    global cnt
    cnt, i = 0, 0
    def dfs(i, x, sn):
        global cnt
        if i >= len(numbers) or i < 0:
            return
        sn[i] = numbers[i]*x
        if i == len(numbers)-1 and target == sum(sn):
            cnt += 1
        dfs(i + 1, 1, sn)
        dfs(i + 1, -1, sn)
        return cnt

    numbers = [0] + numbers
    sn = [0]*(len(numbers))
    return dfs(i, 1, sn)

def solution(n, arr1, arr2):
    bmap = [list(format(arr1[i] | arr2[i], 'b').zfill(n)) for i in range(n)]   
    return [''.join(list(map(lambda x: ' ' if x == '0' else '#', j))) for j in bmap]

import itertools 
import collections

def solution(relation):
    r, c = len(relation), len(relation[0])
    keys = []
    comb = []
    
    for i in range(1, c+1):
        comb += list(itertools.combinations(range(c), i)) 
    for i in comb:
        check_list = [tuple(row[j] for j in i) for row in relation]
        if len(set(check_list)) == len(check_list):
            keys.append(i)
    answer = set(keys[:])
    for k in range(len(keys)):
        for kn in range(k+1,len(keys)):
            if keys[k] != keys[kn] and set(keys[k]).issubset(set(keys[kn])):
                answer.discard(keys[kn])
    return len(answer)

def solution(arr1, arr2):
    if len(arr1) == len(arr2) and len(arr1[0]) == len(arr2[0]):
        return [list(map(sum, zip(arr1[i],arr2[i]))) for i in range(len(arr1))]

nums = list(range(1, int(input())+1))
result = []
prev_elements = []
def dfs(elements):
    if len(elements) == 0:
        result.append(prev_elements[:])
    
    for e in elements:
        next_elements = elements[:]
        next_elements.remove(e)
        prev_elements.append(e)
        
        dfs(next_elements)
        prev_elements.pop()
dfs(nums)
for i in result:
    for j in i:
        print(j, end = ' ')
    print()

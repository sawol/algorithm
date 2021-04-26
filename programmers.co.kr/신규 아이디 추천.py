import re

def dot(new_id:str):
    if new_id and new_id[0] == '.':
        new_id = new_id[1:]
    if new_id and new_id[-1] == '.':
        new_id = new_id[:-1]
    return new_id

def solution(new_id):
    new_id = re.sub('[^a-z0-9-_.]','', new_id.lower())  # 1 & 2
    while '..' in new_id:    # 3
        new_id = new_id.replace('..','.')
    new_id = dot(new_id)    # 4
    if not new_id:  # 5
        new_id = 'a'
    if len(new_id) >= 16:   # 6
        new_id = new_id[:15]
        new_id = dot(new_id)
    while len(new_id) < 3:  # 7
        new_id += new_id[-1]
    return new_id

def solution(w,h):
    x,y = w,h
    while y:
        x,y = y,x%y
    return w*h-(w+h-x)

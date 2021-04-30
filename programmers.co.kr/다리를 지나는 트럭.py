def solution(bridge_length, weight, truck_weights):
    answer = 0
    start = truck_weights[:]
    bridge, time, end = [], [], []
    while end != truck_weights:
        answer += 1
        if time and not time[0]:
            end.append(bridge.pop(0))
            time.pop(0)
        if start and sum(bridge) + start[0] <= weight:
            bridge.append(start.pop(0))
            time.append(bridge_length)
        time = list(map(lambda x: x-1, time))
    return answer

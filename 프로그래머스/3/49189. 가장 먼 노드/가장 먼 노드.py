from collections import deque

def solution(n, vertex):
    graph = [[] for _ in range(n + 1)]

    for a, b in vertex:
        graph[a].append(b)
        graph[b].append(a)

    # 최단 거리 배열
    distance = [-1] * (n + 1)  # 방문하지 않은 노드 -> 거리 -1
    distance[1] = 0  # 1번 노드는 시작 -> 거리 0
    
    queue = deque([1])
    
    while queue:
        node = queue.popleft()
        
        for neighbor in graph[node]:
            if distance[neighbor] == -1:  # 아직 방문하지 않은 노드이면
                distance[neighbor] = distance[node] + 1
                queue.append(neighbor)
    
    max_distance = max(distance)
    
    return distance.count(max_distance)

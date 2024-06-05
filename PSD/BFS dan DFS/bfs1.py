from collections import defaultdict

def bfs_shortest_path(graph, start, end):
    queue = [(start, [start])]
    while queue:
        (node, path) = queue.pop(0)
        for next_node in graph[node]:
            if next_node in path:
                continue
            new_path = path + [next_node]
            if next_node == end:
                return new_path
            queue.append((next_node, new_path))
    return None

# Example weighted graph
graph = {
    'A': {'B': 5, 'C': 3},
    'B': {'C': 2, 'D': 1},
    'C': {'E': 4},
    'D': {'E': 6},
    'E': {}
}

start = 'A'
end = 'E'

shortest_path = bfs_shortest_path(graph, start, end)
print("Shortest path from", start, "to", end, "is:", shortest_path)
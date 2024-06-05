def dfs(graph, start, goal, path, visited, current_cost, min_cost, best_path):
    path.append(start)
    visited.add(start)

    # Jika kita mencapai tujuan, periksa apakah jalur ini lebih pendek
    if start == goal:
        if current_cost < min_cost[0]:
            min_cost[0] = current_cost
            best_path.clear()
            best_path.extend(list(path))
    else:
        # Jelajahi tetangga yang belum dikunjungi
        for neighbor, weight in graph[start].items():
            if neighbor not in visited:
                dfs(graph, neighbor, goal, path, visited, current_cost + weight, min_cost, best_path)

    # Hapus start dari path dan visited untuk backtracking
    path.pop()
    visited.remove(start)

def find_shortest_path_dfs(graph, start, goal):
    visited = set()
    path = []
    min_cost = [float('inf')]
    best_path = []

    dfs(graph, start, goal, path, visited, 0, min_cost, best_path)

    return best_path, min_cost[0]

# Contoh penggunaan
graph = {
    'A': {'B': 1, 'C': 4},
    'B': {'A': 1, 'D': 2, 'E': 5},
    'C': {'A': 4, 'F': 3},
    'D': {'B': 2},
    'E': {'B': 5, 'F': 1},
    'F': {'C': 3, 'E': 1}
}

start = 'A'
goal = 'F'
path, cost = find_shortest_path_dfs(graph, start, goal)
print(f"The shortest path from {start} to {goal} is: {path} with total cost {cost}")

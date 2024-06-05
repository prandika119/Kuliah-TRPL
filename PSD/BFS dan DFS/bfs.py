from collections import deque

def bfs_shortest_path(graph, start, goal):
    # Create a queue for BFS
    queue = deque([[start]])
    # Set to keep track of visited nodes
    visited = set()

    while queue:
        # Get the first path from the queue
        path = queue.popleft()
        # Get the last node from the path
        node = path[-1]

        # If this node is the goal, return the path
        if node == goal:
            return path

        # If the node has not been visited, continue to its neighbors
        if node not in visited:
            for neighbor in graph.get(node, []):
                new_path = list(path)
                new_path.append(neighbor)
                queue.append(new_path)

            # Mark the node as visited
            visited.add(node)

    # If there is no path between the start and goal
    return None

# Example usage
graph = {
    'A': ['B', 'C'],
    'B': ['A', 'D', 'E'],
    'C': ['A', 'F'],
    'D': ['B'],
    'E': ['B', 'F'],
    'F': ['C', 'E']
}

start = 'A'
goal = 'F'
path = bfs_shortest_path(graph, start, goal)
print(f"The shortest path from {start} to {goal} is: {path}")

# NAMA : Andika Dwi Prasetya
# NIM : 23/522305/SV/23658

def prim_dijkstra(graph, start_node):
    mst = set()
    visited = {node: False for node in graph}
    edges = [
        (cost, start_node, to)
        for to, cost in graph[start_node].items()
    ]
    edges.sort(key=lambda x: x[0])
    print(visited)
    print(edges)

    while edges:
        cost, frm, to = edges.pop(0)
        if not visited[to]:
            visited[to] = True
            mst.add((frm, to, cost))
            for to_next, cost2 in graph[to].items():
                if not visited[to_next]:
                    edges.append((cost2, to, to_next))
                    edges.sort(key=lambda x: x[0])
                    print(visited)
                    print(edges)

    return mst

# contoh penggunaan:
graph = {
    'A': {'B': 2, 'C': 3},
    'B': {'A': 2, 'C': 1, 'D': 1, 'E': 4},
    'C': {'A': 3, 'B': 1, 'F': 5},
    'D': {'B': 1, 'E': 1},
    'E': {'B': 4, 'D': 1, 'F': 1},
    'F': {'C': 5, 'E': 1, 'G': 1},
    'G': {'F': 1},
}

mst = prim_dijkstra(graph, 'A')
print("Edges in the minimum spanning tree:", mst)
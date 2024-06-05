from anytree import Node, RenderTree

class HuffmanNode(Node):
    def __lt__(self, other):
        return self.count < other.count

def build_huffman_tree(frequencies):
    nodes = [HuffmanNode(char, count=frequency) for char, frequency in frequencies.items()]
    while len(nodes) > 1:
        nodes.sort()
        left = nodes.pop(0)
        right = nodes.pop(0)
        parent = HuffmanNode('', count=left.count + right.count)
        left.parent = parent
        right.parent = parent
        nodes.append(parent)
    return nodes[0]

def generate_huffman_codes(node, code=''):
    if node.is_leaf:
        print(f"Character: {node.name}, Code: {code}")
    else:
        generate_huffman_codes(node.left, code + '0')
        generate_huffman_codes(node.right, code + '1')

# Example usage
frequencies = {'A': 5, 'B': 9, 'C': 12, 'D': 13, 'E': 16, 'F': 45}
root = build_huffman_tree(frequencies)
generate_huffman_codes(root)
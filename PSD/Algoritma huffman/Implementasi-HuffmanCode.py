# Nama = Andika Dwi Prasetya
# NIM = 23/522305/SV/23658
# KELAS = B2

# Contoh
string = 'PSD TEGAR A N'

# Membuat kelas tree nodes
class NodeTree(object):
    def __init__(self, left=None, right=None):
        self.left = left
        self.right = right
    def children(self):
        return (self.left, self.right)
# ------------------------


# Fungsi untuk menentukan kode huffman dari tree yang sudah dibuat
def huffman_code_tree(node, left=True, kode=''):
    if type(node) is str:
        return {node: kode}
    (l, r) = node.children()
    d = dict()
    d.update(huffman_code_tree(l, True, kode + '0'))
    d.update(huffman_code_tree(r, False, kode + '1'))
    return d
# ----------------------------------------------------------------


# Menghitung frekuensi tiap karakter dan memasukannya ke list serta sudah 
# diurutkan descending
freq = {}
for c in string:
    if c in freq:
        freq[c] += 1
    else:
        freq[c] = 1
freq = sorted(freq.items(), key=lambda x: x[1], reverse=True)
nodes = freq
# ------------------------------------------------------------------------


# Data list yang sudah diurutkan akan di implementasikan ke tree
while len(nodes) > 1:
    (key1, c1) = nodes[-1]
    (key2, c2) = nodes[-2]
    nodes = nodes[:-2]
    node = NodeTree(key1, key2)
    nodes.append((node, c1 + c2))
    nodes = sorted(nodes, key=lambda x: x[1], reverse=True)
    # output akhir [(*frek:frequensi)]
# -------------------------------------------------------------


# Mencari huffman code
huffmanCode = huffman_code_tree(nodes[0][0])

# Mengoutputkan hasil huffman kode
print ('\nKalimat yang akan dikompres : ', string)
print(' \nChar | Huffman code ')
print('----------------------')
for (char, frequency) in freq:
    print((char, huffmanCode[char]))


import anytree

def huffman_encoding(symbols, frequencies):
  """
  Fungsi ini mengimplementasikan algoritma Huffman untuk encoding simbol.

  Args:
    symbols: Daftar simbol yang ingin dienkode.
    frequencies: Daftar frekuensi masing-masing simbol.

  Returns:
    Kamus yang berisi kode Huffman untuk setiap simbol.
  """

  # Membangun daftar pasangan simbol-frekuensi
  symbol_frequency_pairs = []
  for i in range(len(symbols)):
    symbol_frequency_pairs.append((symbols[i], frequencies[i]))

  # Mengurutkan daftar pasangan simbol-frekuensi berdasarkan frekuensi
  symbol_frequency_pairs.sort(key=lambda pair: pair[1])

  # Membangun pohon Huffman
  root = anytree.Node()
  while len(symbol_frequency_pairs) > 1:
    # Mengambil dua pasangan simbol-frekuensi dengan frekuensi terendah
    first_pair = symbol_frequency_pairs.pop(0)
    second_pair = symbol_frequency_pairs.pop(0)

    # Menambahkan frekuensi dua pasangan
    total_frequency = first_pair[1] + second_pair[1]

    # Membangun node baru untuk dua pasangan
    node = anytree.Node(total_frequency, parent=root)
    node.left = anytree.Node(first_pair[0], parent=node)
    node.right = anytree.Node(second_pair[0], parent=node)

    # Menambahkan node baru ke daftar pasangan simbol-frekuensi
    symbol_frequency_pairs.append((node.symbol, total_frequency))

  # Menghitung kode Huffman untuk setiap simbol
  huffman_codes = {}
  for node in anytree.level_order(root):
    if node.is_leaf:
      code = ""
      parent = node.parent
      while parent is not root:
        code = parent.name + code
        parent = parent.parent
      huffman_codes[node.symbol] = code

  return huffman_codes

# Contoh penggunaan
symbols = ["a", "b", "c", "d", "e"]
frequencies = [5, 2, 3, 4, 1]

huffman_codes = huffman_encoding(symbols, frequencies)
print(huffman_codes)

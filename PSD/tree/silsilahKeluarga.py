# Mengimport library anytree
from anytree import Node, RenderTree

# Membuat node 
kakek_nenek = Node("Sariyah & martaja")
om_tante = Node("Juri & riyah", parent=kakek_nenek)
ayah_ibu = Node("Udin & Ratni", parent=kakek_nenek)
paman_bibi = Node("tarno & kani", parent=kakek_nenek)
anak1_ayah_ibu = Node("wahyu", parent=ayah_ibu)
anak2_ayah_ibu = Node("andika", parent=ayah_ibu)
anak1_paman_bibi = Node("ningrum", parent=paman_bibi)
anak2_paman_bibi = Node("alya", parent=paman_bibi)
anak1_om_tante = Node("gopur", parent=om_tante)
anak2_om_tante = Node("dwi", parent=om_tante)
anak3_om_tante = Node("puji", parent=om_tante)

# Menampilkan root dan anak-anaknya
for pre, fill, node in RenderTree(kakek_nenek):
     print("%s%s" % (pre, node.name))

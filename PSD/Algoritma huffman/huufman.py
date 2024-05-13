

class Noode :
    def __init__ (self, karakter, freq, left=None, right = None):
        self.karakter = karakter
        self.freq = freq
        self.left = None
        self.right = None
    def addParent (self,left,right, value):
        self.left = left
        self.right = right
        self.value = value
        self.freq = left.freq + right.freq 
    def children (self):
        return (self.left, self.right)

def huffman (node, left = True, kode = ""):
    if node is str :
        return {node:kode}
    (l,r) = node.children()
    nilaiNode = dict ()
    nilaiNode.update(huffman (l, True, kode + "0"))
    nilaiNode.update(huffman (r, True, kode + "1"))
    return nilaiNode

kalimat = "LOGIKA ALGORITMA"

frekuensi = {}
for i in kalimat :
    if i in frekuensi:
        frekuensi[i] += 1
    else :
        frekuensi[i]=1
c = sorted(frekuensi.items(), key = lambda x:x[1])
list_data = c
i = 0
while len(c)>1 and i < len(c)-1:
    Noode1 = Noode(c[i][0],c[i][1]) 
    Noode2 = Noode(c[i+1][0], c[i+1][1])
    parent = Noode (None,None)
    parent.addParent(Noode1,Noode2,i)
    tparent = ("*"+str((parent.value//2+1)), parent.freq)
    c.append(tparent)
    c = sorted(c, key = lambda x:x[1], reverse=True)
    i += 2
huffman (c[0][0])
print(c)

# for i in range(len(c)):

# b = sorted(frekuensi, key= lambda x:frekuensi[x])
# print(b)
# c = {}
# for i in range (len(frekuensi)):
#     c [a[i]] = b[i]
# print(c)
    
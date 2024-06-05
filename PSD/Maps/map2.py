# Hitung total bobot barang yang dibawa oleh masing-masing penumpang yang akan akan pergi ke Singapore menggunakan jasa penerbangan. Input dan output dapat berupa struktur data seperti contoh berikut:


# Input:

# Data_barang_penumpang = [

#     ("Slamet", [("Sepatu", 2), ("Laptop", 1), ("Jeruk", 3)]),

#     ("Ani", [("Pisang", 1), ("Ketela", 4), ("Baju", 5)]),

#     ("Budi", [("Seterika", 2), ("Buku", 3), ("Kamera", 4)])

# ]


# Output:

# { Slamet: 6, 'Ani': 10, 'Budi': 9}

# Kumpulkan pekerjaan Anda dalam bentuk file Python!

Data_barang_penumpang = [

    ("Slamet", [("Sepatu", 2), ("Laptop", 1), ("Jeruk", 3)]),

    ("Ani", [("Pisang", 1), ("Ketela", 4), ("Baju", 5)]),

    ("Budi", [("Seterika", 2), ("Buku", 3), ("Kamera", 4)])

]


# def cariBerat (x):
#     bobot = 0
#     output = {}
#     for i in Data_barang_penumpang:
#         for j in range (len(i[1])):
#             bobot += i[1][j][1]
#         output [i[0]] = bobot
#         bobot = 0
#         return (output)

def cari_berat (a):
    bobot = 0
    for i in range (len(a[1])) :
        bobot += a[1][i][1]
    return bobot

hitung = dict(map(lambda x : (x[0], cari_berat(x)), Data_barang_penumpang ))
print(hitung)
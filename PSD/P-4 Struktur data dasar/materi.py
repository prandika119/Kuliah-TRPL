# Fungsi tanpa parameter, tidak mengembalikan nilai
def cetak_pola():
  for i in range(1, 11):
    print(" " * (10 - i) + str(i) * i)
cetak_pola()

# Fungsi berparameter dan tanpa mengembalikan nilai
def faktorial(n):
  """
  Fungsi ini menghitung faktorial dari suatu bilangan.
  """
  if n == 0:
    return 1
  else:
    return n * faktorial (n - 1)
  
faktorial(5)

# Fungsi tanpa parameter, mengembalikan nilai
def get_data_sensor():
  """
  Fungsi ini mensimulasikan pengambilan data dari sensor.
  """
  import random
  return random.randint(1, 100)

data_sensor = get_data_sensor()
print(data_sensor)

# Fungsi berparameter dan mengembalikan nilai
def hitung_luas_lingkaran(r):
  """
  Fungsi ini menghitung luas lingkaran.
  """
  import math
  return math.pi * r ** 2

luas_lingkaran = hitung_luas_lingkaran(5)
print(luas_lingkaran)

# Fungsi Parameter default dan mengembalikan nilai
def hitung_luas_lingkaran(r=5):
  """
  Fungsi ini menghitung luas lingkaran.
  """
  import math
  return math.pi * r ** 2

luas_lingkaran = hitung_luas_lingkaran(10)
print(luas_lingkaran)

# Latihan
"""
Masukkan jumlah mahasiswa: 2

Masukkan NIM mahasiswa ke-1: 
Masukkan nama mahasiswa ke-1: 
Masukkan daerah asal mahasiswa ke-1:

Masukkan NIM mahasiswa ke-2: 
Masukkan nama mahasiswa ke-2:
Masukkan daerah asal mahasiswa ke-2:

OUTPUT

Data Mahasiswa:
--------------------
NIM: 123456789
Nama: Budi Santoso
Daerah Asal: Jakarta
--------------------
NIM: 987654321
Nama: Ani Lestari
Daerah Asal: Bandung
"""

def tambah_mahasiswa():
    jumlah_mahasiwa = int(input("Masukkan jumlah mahasiswa: "))
    data_mahasiswa = []
    for i in range(jumlah_mahasiwa):
        nim = input("Masukkan nim mahasiswa ke-%d : " % (i + 1))
        nama = input("Masukkan nama mahasiswa ke-%d : " % (i + 1))
        asal = input("Masukkan asal daerah mahasiswa ke-%d : " % (i + 1))
        data_mahasiswa.append([nim,nama,asal])
    print(data_mahasiswa)
    for i in range(jumlah_mahasiwa):
        print("-"*20)
        print("NIM: " + data_mahasiswa[i][0])
        print("Nama: " + data_mahasiswa[i][1])
        print("Daerah Asal: " + data_mahasiswa[i][2])
tambah_mahasiswa()
'''
INPUT

Masukkan jumlah mahasiswa: 2
Masukkan nama mahasiswa ke-1: Budi Santoso
Masukkan NIM mahasiswa ke-1: 123456789
Masukkan jumlah nilai ujian mahasiswa ke-1: 3
Masukkan nilai ujian ke-1: 80
Masukkan nilai ujian ke-2: 90
Masukkan nilai ujian ke-3: 100

Masukkan nama mahasiswa ke-2: Ani Lestari
Masukkan NIM mahasiswa ke-2: 987654321
Masukkan jumlah nilai ujian mahasiswa ke-2: 2
Masukkan nilai ujian ke-1: 95
Masukkan nilai ujian ke-2: 100

OUTPUT

Nama: Budi Santoso
NIM: 123456789
Rata-rata Nilai Ujian: 90.0

Nama: Ani Lestari
NIM: 987654321
Rata-rata Nilai Ujian: 97.5
'''

def tambahData () :
    jmlMahasiswa = int(input('Masukan jumlah mahasiswa :'))
    dataMahasiswa = []
    for i in range (jmlMahasiswa):
        nama = input("Masukan nama mahasiswa ke- %d : " %(i+1))
        nim = input ("Masukan nim mahasiswa ke- %d : " %(i+1))
        jmlNilai = int(input ("Masukan jumlah nilai mahasiswa ke- %d yang akan dimasukan  : " %(i+1)))
        dataNilai = []
        rata = 0
        for i in range (jmlNilai):
            nilai = int(input("Masukan nilai ujian ke- %d : " %(i+1)))
            dataNilai.append(nilai)
        for i in range (len(dataNilai)):
            rata += dataNilai[i]
        rata /= len(dataNilai) # rata = rata / len(dataNilai)

        dataMahasiswa.append([nama,nim,rata])

    #output
    print("\n Data Mahasiswa")
    for i in range (jmlMahasiswa):
        print('-'*20)
        print("Nama :", dataMahasiswa[i][0])
        print("Nim :", dataMahasiswa[i][1])
        print("Rata-rata nilai ujian :", dataMahasiswa[i][2])
tambahData()

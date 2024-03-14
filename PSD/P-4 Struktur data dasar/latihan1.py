def tambah_mahasiswa():
    jmlMahasiswa = int(input('Masukan jumlah mahasiswa :'))
    dataMahasiswa = []
    for i in range (jmlMahasiswa):
        nama = input("Masukan nama mahasiswa ke- %d : " %(i+1))
        nim = input ("Masukan nim mahasiswa ke- %d : " %(i+1))
        asal = input ("Masukan alamat mahasiswa ke- %d : " %(i+1))
        dataMahasiswa.append([nama,nim,asal])
    print("Data Mahasiswa")
    for i in range (jmlMahasiswa):
        print('-'*20)
        print("Nama :", dataMahasiswa[i][0])
        print("Nim :", dataMahasiswa[i][1])
        print("Asal :", dataMahasiswa[i][2])
tambah_mahasiswa()
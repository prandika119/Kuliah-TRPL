# Pelajari tentang materi Bab IX modul praktikum struktur data dan kerjakan studi kasus berikut menggunakan Maps pada Python!

# Buatlah program untuk mengubah huruf besar (kapital) menjadi huruf kecil dan huruf kecil menjadi huruf besar (kapital) dari suatu input yang berupa teks.

# Contoh:

# Input : Indonesia Tanah Air beta

# Output : iNDONESIA tANAH aIR BETA

# Kumpulkan pekerjaan Anda dalam bentuk file Python!

inputan = "Indonesia Tanah Air beta"
hasil = list(map(str.swapcase, inputan))
print(''.join(hasil))

#Cara lain
inputan = "Indonesia Tanah Air beta"
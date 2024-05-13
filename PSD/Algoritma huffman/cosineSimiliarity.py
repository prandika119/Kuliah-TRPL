kalimat1 = "Julie loves me more than Linda loves me"
kalimat2 = "Jane likes me more than Julie loves me"

def cariKata(kalimat):
    karakter = {}
    perKata = list(map(str, kalimat.split()))
    for i in perKata :
        if i in karakter :
            karakter[i] += 1
        else :
            karakter[i] = 1 
    return karakter

def dot(a,b):
    for i in a :
        i

kalimatPertama = cariKata(kalimat1).items()
kalimatKedua = cariKata(kalimat2).items()
print(kalimatPertama)
print(kalimatKedua)

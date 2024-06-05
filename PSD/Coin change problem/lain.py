inilaicari = 23
imaxcari = 25
ijumkoin = 3
koin = [3, 5, 12]

C = ["x"] * imaxcari

for j in range(ijumkoin):
    C[koin[j] - 1] = "B"

print("Initial C:", C)

for n in range(imaxcari):
    for j in range(ijumkoin):
        if n >= koin[j] and C[n - koin[j]] == "B":
            C[n] = "B"

print("Updated C:", C)

if C[inilaicari - 1] == "B":
    print(f"nilai {inilaicari} bisa di cari dengan {koin}")
else:
    print("Tidak bisa")
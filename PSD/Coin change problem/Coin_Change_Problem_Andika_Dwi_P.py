dicari = 23
max = 25
nilai = {}
koin = [3, 5, 12]
for i in range(1, max+1):
    if i in koin:
        nilai[i] = True
    else:
        nilai[i] = False

keys = nilai.keys()
for key in keys:
    for k in koin:
        if key - k > 0:
            if nilai[key - k] == True :
                nilai[key] = True
                break

# Pull element yang tidak dicari
for i in range (1, max+1):
    if nilai[i] == False:
        del nilai[i]
print(f"\nnilai yang bisa dibentuk dari pecahan 3, 5, dan 12 yaitu :\n{nilai.keys()}")

# Mencari kombinasi elemen
def count_coin_combinations(koin, dicari):
    dp = [0] * (dicari + 1)
    dp[0] = 1
    for k in koin:
        for i in range(k, dicari + 1):
            dp[i] += dp[i - k]
    return dp[dicari]

result = count_coin_combinations(koin, dicari)
print(f"\nJumlah kombinasi koin untuk mencapai {dicari} adalah {result}.")

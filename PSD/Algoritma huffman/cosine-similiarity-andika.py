def dot_product(A, B):
    return sum(a * b for a, b in zip(A, B))

def jmlKuadratAkar(vector):
    return sum(x ** 2 for x in vector) ** 0.5

def cosine_similarity(A, B):
    dot_prod = dot_product(A, B)
    jmlKuadratAkar_A = jmlKuadratAkar(A)
    jmlKuadratAkar_B = jmlKuadratAkar(B)
    similarity = dot_prod / (jmlKuadratAkar_A * jmlKuadratAkar_B)
    return similarity

# Contoh penggunaan
vector1 = [1, 2, 3]
vector2 = [4, 5, 6]

cosine_sim = cosine_similarity(vector1, vector2)
print(f"vektor 1 : {vector1}")
print(f"vektor 2 : {vector2}")
print(f"Cosine Similarity: {cosine_sim}")

# def change (i=1,j=2) :
#     i = i+j
#     j = j+1
#     print(i,j)
# change(j=1, i=2)

# x=50
# def func(x):
#     print('x is', x)
#     x = 2
#     print('chang x to', x)
# func(x)
# print(x)

#16
def foo(k):
    k[0]=3
    return k
q=[1]
print(foo(q))
print(q)

def foo(k):
    k=[0]
    return k
q=[1]
print(foo(q))
print(q)

def a(b):
    b = b+[5]
    return b
c =[1,2,3,4]
print(a(c))
print(c)
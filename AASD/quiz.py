# a = 10
# b = 20
# def change():
#     global b
#     a = 45
#     b = 56
# change()
# print(a)
# print(b)

# def cube(x):
#     x*x*x
# x = cube(3)
# print(x)

# def f(p,q,r):
#     global s
#     p = 10
#     q = 20
#     r = 30
#     s = 40
#     print(p,q,r,s)
# p,q,r,s = 1,2,3,4
# f(5,10,15)

# def f():
#     global a
#     print(a)
#     a = 'hellp'
#     print (a)
# a = 'world'
# f()
# print(a)

# def a(b):
#     b = b+[5]
# c = [1,2,3,4]
# a(c)
# print(len(c))

# def f(x):
#     print('outer')
#     def f1(a):
#         print('inner')
#         print(a,x)
# f(3)
# f1(1)

# def f1(a,b=[]):
#     b.append(a)
#     return b
# print(f1(2,[3,4]))

# x = 1
# def cg():
#     global x
#     x = x+1
# cg()
# x

# x = 12
# def f1(a,b=x):
#     print(a,b)
# x = 15
# f1(4)

# #gpt
# def foo(k):
#     k = [1]
# q = [0]
# foo(q)
# print(q)

# def f(): x =4
# x=1
# f()
# x

# def foo(i,x=[]):
#     x.append(i)
#     return x
# for i in range(3):
#     print(foo(i))

# i =0
# def chn (i):
#     i = i+1
#     return i
# chn(1)
# print(i)

# def power (x,y=2):
#     r = 1 #x = 3, y=2
#     for i in range(y):
#         r = r* x
#     return r
# print (power(3))
# print (power(3,3))

# x = 5
# def f1():
#     global x
#     x=4
# def f2(a,b):
#     global x
#     return a+b+x
# f1()
# total = f2(1,2)
# print(total)

# def foo(x):
#     x = ['def','abc']
#     return id(x)
# q = ['abc','def']
# print(id(q)==foo(q))

def sum(*args):
    r = 0
    for i in args :
        r += i
    return r
print (sum.__doc__)
print (sum(1,2,3))
print (sum(1,2,3,4,5))

y, z = 1,2
def f():
    global x
    x = y+z
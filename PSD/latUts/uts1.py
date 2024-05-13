class Stack:
    def __init__(self):
        self.list = []
    def push(self,item):
        self.list.append(item)
    def pop(self):
        return self.list.pop()
    def get(self):
        return self.list
    def getTop3(self):
        return self.list[-3]+self.list[-2]+self.list[-1]
    
# string = "acaabcbcdaabcbc"
string = input("Masukan string : ")
hapus = 0
stack = Stack ()
for i in string :
    stack.push(i)
    if len(stack.get()) >= 3 :
        if stack.getTop3() == "abc" :
            for a in range(3):
                stack.pop()
            hapus += 1
        # print(stack.get())
print(hapus)

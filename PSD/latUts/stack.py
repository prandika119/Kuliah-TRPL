class Stack:
    def __init__(self):
        self.items = []
    
    def isEmpty(self):
        if self.items == [] :
            return True
        else :
            return False
        
    def push (self, item):
        self.items.append(item)

    def pop(self):
        return self.items.pop()
    
    def peek (self):
        return self.items[len(self.items)-1]
    
    def size (self):
        return len(self.items)
    
    def getItem (self):
        return self.items



stack = Stack()
sebelum = ['selamat', 'pagi', 'apa', 'kabar']
sesudah = []
for i in sebelum :
    stack.push(i)
for j in range(stack.size()) :
    # sesudah += stack.pop()
    sesudah.append(stack.pop())
print(sesudah)

# class Stack :
# 	def __init__ (self):
# 		self.stack = []
# 	def push (self, item):
# 		self.stack.append(item)
# 	def pop (self) :
# 		self.stack.pop()
# 	def peek (self):
# 		return self.stack[len(self.stack)-1]
# 	def isEmpty(self):
# 		if self.stack == []:
# 			return True
# 		else :
# 			return False
# 	def size (self):
# 		return len(self.stack)
	
# list1 = Stack()
# list1.push(1)
# list1.push(2)
# list1.push(3)
# list1.push(9)
# list1.pop()
# print(list1.peek())
# print(list1.size())
# print(list1.isEmpty())
# print(list1.items)
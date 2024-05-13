class Queue :
    def __init__(self, maxSize) :
        self.queue = [0]*maxSize
        self.head = 0
        self.tail = -1
    def push(self, item):
        self.tail += 1
        self.queue[self.tail] = item
    def pop(self):
        self.head += 1
    def front (self):
        return self.queue[head]
    def isEmpty(self):
        if self.head>self.tail :
            return True
        else :
            return False
        
queue1 = Queue(3)
    
queue1.push(2)
queue1.push(3)
queue1.push(4)
# queue1.push(5)
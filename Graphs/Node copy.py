class Node:
    def _init_(self,name):
        self.children = []
        self.name = name

    def addChild(self,name):
        self.children.append(Node(name))


     
    def breadthFirstSearch(self,array):
        queue = [self]
        while len(queue)>0  #while the queue is not empty
            current  = queue.pop(0)  #pop of the first value of queue
            array.append(current.name) #add it to the final array
            for child in current.children #for each child in current we will add it to the queu
                queue.append(child)
        return array        
        

        

class Node:
    def _init_(self,name):
        self.children = []
        self.name = name

    def addChild(self,name):
        self.children.append(Node(name))

     #O(v+e) time  / O(v) space
    #for each child node it will be called in depthFirstSearch
    #add to final array
    def depthFirstSearch(self,array):
        array.append(self.name)       
        for child in self.children
            child.depthFirstSearch(array)
        return array

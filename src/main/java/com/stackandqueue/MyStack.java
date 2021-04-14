package com.stackandqueue;

public class MyStack {
    private final MyLinkedList myLinkedList;

    public MyStack(){
        this.myLinkedList = new MyLinkedList();
    }

    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }

    public void printStack(){
        myLinkedList.printMyNodes();
    }
    /* @Description- it is used to peak  the element from the stack.*/
    public INode peak(){
        return myLinkedList.head;
    }
/* @Description- it is used to pop the element.*/
    public INode pop() {
        return myLinkedList.pop();
    }
}

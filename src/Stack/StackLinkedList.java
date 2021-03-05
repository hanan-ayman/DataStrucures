/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import singlelinkedlist.Node;

/**
 *
 * @author 20101
 */
public class StackLinkedList<T> {
   Node head = null, tail = null;

    public void push(String value) { // push to head
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head; // make my temp point to the old head
            head = temp; // make the head point to my temp
        }
    }

    public void pop() { // pop from head
        if(isEmpty()){
            System.out.println("the stack is empty! ");
            return;
        }
            
        head = head.next;
    }

    public void printLinkedList() {
        Node pointer = head;
        while (pointer != null) {
            System.out.println(pointer.val);
            pointer = pointer.next;
        }
    }
    public boolean isEmpty(){
        return (head==null);
    }
}

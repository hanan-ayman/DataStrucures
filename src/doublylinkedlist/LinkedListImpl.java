/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;

/**
 *
 * @author 20101
 */
public class LinkedListImpl implements LinkedList<Integer> {

    public Node head , tail;

    @Override
    public void addNodeAtTail(Integer value) {

        /* 1. allocate node 
        * 2. put in the data */
        Node new_node = new Node(value);

        Node pointer = head;
        /* used in step 5*/

        /* 3. This new node is going to be the last node, so
        * make next of it as NULL*/
        new_node.next = null; // tail

        /* 4. If the Linked List is empty, then make the new
        * node as head */
        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }
        /* 5. Else traverse till the last node */
        while (pointer.next != null) {
            pointer = pointer.next;
        }
        
        /* 6. Change the next of last node */
        pointer.next = new_node;
        
        /* 7. Make last node as previous of new node */
        new_node.prev = pointer;
    }

    @Override
    public void addNodeAtHead(Integer value) {
        /* 1. allocate node 
        * 2. put in the data */
        Node new_Node = new Node(value);

        /* 3. Make next of new node as head and previous as NULL */
        new_Node.next = head;
        new_Node.prev = null;

        /* 4. change prev of head node to new node */
        if (head != null) {
            head.prev = new_Node;
        }

        /* 5. move the head to point to the new node */
        head = new_Node;
    }

    @Override
    public void InsertAfter(Node prev_Node, Integer value) {
        /*1. check if the given prev_node is NULL */
        if (prev_Node == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }

        /* 2. allocate node 
        * 3. put in the data */
        Node new_node = new Node(value);

        /* 4. Make next of new node as next of prev_node */
        new_node.next = prev_Node.next.next;

        /* 5. Make the next of prev_node as new_node */
        prev_Node.next = new_node;

        /* 6. Make prev_node as previous of new_node */
        new_node.prev = prev_Node;

    }

    @Override
    public void removeNodeAtTail() {

    }

    @Override
    public void removeNodeAtHead() {
    }

    @Override
    public void removeNodeAtSpecificIndex(int Index) {

    }

    @Override
    public boolean search(String target) {

        return false;
    }

    @Override
    public int searchAndReturnIndex(String target) {

        return -1;
    }

    @Override
    public void printLinkedList() {
           Node pointer = head;
        while (pointer != null) {
            System.out.println(pointer.val);
            pointer = pointer.next;
        }
    }
    // This function prints contents of 
    // linked list starting from the given node
    public void printlist(Node node)
    {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.val + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.val + " ");
            last = last.prev;
        }
    }

}

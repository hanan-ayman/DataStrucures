/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinkedlist;

/**
 *
 * @author 20101
 */
public class LinkedListImpl implements LinkedList<String> {

    Node head = null, tail = null;

    @Override
    public void addNodeAtTail(String value) {
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = tail.next;
        }
    }

    @Override
    public void addNodeAtHead(String value) {
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    @Override
    public void addNodeAtSpecificIndex(String value, int Index) {
        Node pointer = head;
        Node temp = new Node(value);
        for (int count = 0; count < Index - 1; count++) {
            pointer = pointer.next;
        }
        temp.next = pointer.next;
        pointer.next = temp;
    }

    @Override
    public void removeNodeAtTail() {
        Node pointer = head;
        while (pointer.next != null && pointer.next.next != null) {
            pointer = pointer.next;
        }
        pointer.next = null;
        tail = pointer;
    }

    @Override
    public void removeNodeAtHead() {
        head = head.next;
    }

    @Override
    public void removeNodeAtSpecificIndex(int Index) {
        Node pointer = head;
        for (int count = 0; count < Index - 1; count++) {
            pointer = pointer.next;
        }
        pointer.val = pointer.next.val;
        pointer.next = pointer.next.next;
    }

    @Override
    public boolean search(String target) {
        Node pointer = head;
        while (pointer != null) {
            if (pointer.val == target) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int searchAndReturnIndex(String target) {
        Node pointer = head;
        int counter = 0;
        while (pointer != null) {
            counter++;
            if (pointer.val == target) {
                return counter;
            }
        }
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

}

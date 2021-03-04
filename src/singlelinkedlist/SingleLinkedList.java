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
public class SingleLinkedList {

    /**
     * Time Complexity
        The time complexity for each of the operations is:
        *Addition - O(1)
        *Addition at Index - O(n) where n is the number of elements.
        *Removal - O(1)
        *Removal at Index - O(n) where is the number of elements.
        *Search - O(n) where n is the number of elements.
     */
    public static void main(String[] args) {
    LinkedList list = new LinkedListImpl();
    list.addNodeAtHead("a");
    list.addNodeAtHead("b");
    list.addNodeAtHead("c");
    list.addNodeAtHead("d");

    list.printLinkedList();

    }
    
}

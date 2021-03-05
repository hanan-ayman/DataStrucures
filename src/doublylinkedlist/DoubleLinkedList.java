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
public class DoubleLinkedList {

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

   /* Start with the empty list */
    LinkedListImpl dll = new LinkedListImpl();
 
        // Insert 6. So linked list becomes 6->NULL
        dll.addNodeAtTail(6);
 
        // Insert 7 at the beginning. So 
        //.. linked list becomes 7->6->NULL
        dll.addNodeAtHead(7);
 
        // Insert 1 at the beginning. So 
        // linked list becomes 1->7->6->NULL
        dll.addNodeAtHead(1);
 
        // Insert 4 at the end. So linked 
        // list becomes 1->7->6->4->NULL
        dll.addNodeAtTail(4);
 
       // Insert 8, after 7. So linked 
        // list becomes 1->7->8->6->4->NULL
        dll.InsertAfter(dll.head.next, 8);
 
        System.out.println("Created DLL is: ");
        dll.printlist(dll.head);
        
//        dll.printLinkedList();

    }
    
}

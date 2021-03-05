/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import singlelinkedlist.*;

/**
 *
 * @author 20101
 */
public class Stack {

    /**
     * Stack (LIFO) is 3 types -> array (full), dynamic array (not full), linkedlist(not full)
     * operation -> pop  -> top = top - 1,
     *              push ->
     * Time Complexity
        The time complexity for each of the operations is:
        *insert - O(1) at last element.
        *remove - O(1) from last element also.
        *access - O(n) 
        *Search - O(n) 
     */
    public static void main(String[] args) {
    //Static
    System.out.println("====================Start the static array====================");
    StackArray <String> s = new StackArray<>(3);
    s.push("hanan");
    s.push("nada");
    s.push("fefe");
    System.out.println("TOP Static: "+  s.top);
    System.out.println(s.pop());
    System.out.println("TOP Static: "+  s.top);
    s.push("hello"); // can not add another element
    
    //Dynamic
    System.out.println("====================Start the dynamic array====================");
    StackDynamicArray<Integer> sDynamic = new StackDynamicArray<>(3);
    sDynamic.pop();
    sDynamic.push(11);
    sDynamic.push(12);
    sDynamic.push(22);
    System.out.println("TOP Dynamic: "+  sDynamic.top);
    System.out.println("Size Dynamic: "+  sDynamic.size);
    sDynamic.push(11);
    System.out.println("TOP Dynamic : "+  sDynamic.top);
    System.out.println("Size Dynamic: "+  sDynamic.size); //6
    System.out.println(sDynamic.pop());
    System.out.println("TOP Dynamic: "+  sDynamic.top);
    System.out.println("Size Dynamic: "+  sDynamic.size);
    
    System.out.println("====================Start the linkedlist====================");
    StackLinkedList<String> stackLinkedList = new StackLinkedList<>();
    stackLinkedList.pop();
    stackLinkedList.push("hanan");
    stackLinkedList.push("nada");
    stackLinkedList.push("fefe");
  
    stackLinkedList.printLinkedList();;
    stackLinkedList.pop();
    stackLinkedList.pop();
    stackLinkedList.pop();
    stackLinkedList.pop();
    }
    
}

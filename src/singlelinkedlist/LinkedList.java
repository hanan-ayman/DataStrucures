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
public interface LinkedList <T> {
    //Insertion
    public void addNodeAtTail(T value);
    public void addNodeAtHead(T value);
    public void addNodeAtSpecificIndex(T value , int Index);
    //Deletion
    public void removeNodeAtTail();
    public void removeNodeAtHead();
    public void removeNodeAtSpecificIndex(int Index);
    //Search
    public boolean search(String target);
    public int searchAndReturnIndex(String target);
    //Print
    public void printLinkedList();
}

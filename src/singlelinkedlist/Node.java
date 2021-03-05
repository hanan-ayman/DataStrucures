/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinkedlist;

/**
 *
 * @author 20101
 * @param <T>
 */
public class Node <T> {
    public T val;
    public Node next;

    public Node(T val) {
        this.val = val;
    }
    
}

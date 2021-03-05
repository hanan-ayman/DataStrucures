/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.Arrays;

/**
 *
 * @author 20101
 */
public class StackDynamicArray<T> {
    
    int size;
    Object [] arrayStack;
    int top; // POINTER

    public StackDynamicArray(int size) {
        this.size = size;
        arrayStack = new Object[this.size];
        top = -1;
    }
    
    public void push(Object temp){
        //to make sure if i can add or i will duplicate the size
        ensureCapacity(top+1);
        top = top +1 ;
        arrayStack[top] = temp;
    }
    
    public Object pop(){
        if(isEmpty()){
            System.out.println("the stack is empty;");
            return null;
        }
        Object temp =  arrayStack[top];
        top = top-1;
        return temp;
    }
    
    //re-sizing
    public void ensureCapacity(int minCapacity){
        int oldCapacity = arrayStack.length;
        if(minCapacity >= oldCapacity){
            int newCapacity = oldCapacity*2;
            if(newCapacity < minCapacity)//delete
                newCapacity = minCapacity;
            
            arrayStack= Arrays.copyOf(arrayStack , newCapacity);
            size = newCapacity; // set the size with the newCapacity after update
        }
       
    }
   
    public Boolean isEmpty(){
        return (top == -1);
    }
    
}

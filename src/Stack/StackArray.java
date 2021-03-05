/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author 20101
 */
public class StackArray <T>{
    
    int size;
    Object [] arrayStack;
    int top; // POINTER

    public StackArray(int size) {
        this.size = size;
        arrayStack = new Object[size];
        top = -1;
    }
    
    public void push(Object temp){
        if(isFull()){
            System.out.println("the stack is full;");
            return;
        }
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
    
    public Boolean isFull(){
        return (top == size -1);
    }
    
    public Boolean isEmpty(){
        return (top == -1);
    }
    
}

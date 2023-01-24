/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

/**
 *
 * @author JUSTINE
 */
public class Stack {
    protected static int arr[];
    protected static int top;
    protected static int capacity;

    Stack(int size) {
        arr = new int[size];
        top = -1;
        capacity = size;
    }

    //adding an element to the stack
    public static void push(int data) {
        if (isFull()) {
            System.out.println("Stack is already full!");
        } else {
            arr[++top] = data; //
        }
    }

    //removing an element to the stack
    public static int pop() {
        if(isEmpty()){
            System.out.println("Stack is already empty!");
            return 0;
        }else{
            return arr[top--];
        }
    }

    //returning top data
    public void peek() {
        if (!isEmpty()) {
            System.out.println(arr[top]);
        } else {
            isEmpty();
        }
    }

    public static void printStack() {
        for (int i = 0; i <= top; i++) {
        System.out.print(arr[i] + " | ");
    }
    }

    static boolean isFull() {
        if (top == (capacity - 1)) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isEmpty() {
        return top == -1;
    }
}

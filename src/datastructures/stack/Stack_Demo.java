package datastructures.stack;

import java.io.*;
import java.util.*;

public class Stack_Demo {
    public static void push(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) stack.push(i);
    }

    public static void pop(Stack<Integer> stack) {
        System.out.println("Pop Operation:");
        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    public static void peek(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    public static void search(Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);
        if (pos == -1) System.out.println("Element not found");
        else System.out.println("Element is found at position: " + pos);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        push(stack);
        pop(stack);
        push(stack);
        peek(stack);
        search(stack, 2);
        search(stack, 6);
    }
}

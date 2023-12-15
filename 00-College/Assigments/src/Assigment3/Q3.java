package Assigment3;

import java.util.Scanner;

// Define the Stack interface
interface Stack {
    void push(char c);
    char pop();
    boolean isEmpty();
    boolean isFull();
    char peek();
}

// Implement the Stack interface using an array
class ArrayStack implements Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public ArrayStack(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char c) {
        if (!isFull()) {
            stackArray[++top] = c;
        } else {
            System.out.println("Stack is full. Cannot push.");
        }
    }

    public char pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return '\0'; // Return null character as an indicator of an empty stack
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public char peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return '\0'; // Return null character as an indicator of an empty stack
        }
    }
}

public class Q3 {
    public static boolean isPalindrome(String word) {
        int length = word.length();
        ArrayStack stack = new ArrayStack(length);

        // Push half of the characters onto the stack
        for (int i = 0; i < length / 2; i++) {
            stack.push(word.charAt(i));
        }

        // Compare the remaining characters with the popped characters from the stack
        for (int i = (length + 1) / 2; i < length; i++) {
            if (word.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String");
        String word = in.next();
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}

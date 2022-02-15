package csc1009.src.lect04;

public class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers() {
      this(16);
    }
  
    public StackOfIntegers(int capacity) {
      elements = new int[capacity];
    }

    public boolean empty() {
        return size == 0;
    }

    public int peek() {
        return elements[size - 1];
    }
  
    public int push(int value) {
      return elements[size++] = value;
    }
  
    public int pop() {
      return elements[--size];
    }
  
    public int getSize() {
      return size;
    }

    public static void main(String[] args) {

		StackOfIntegers stack = new StackOfIntegers();
      //Push 0 to 10 to the stack
      for (int i = 0; i < 10; i++) {
          stack.push(i);
      }
      //reverse 
      while (!stack.empty()) {
        System.out.print(stack.pop() + " ");
      }
	  }
}